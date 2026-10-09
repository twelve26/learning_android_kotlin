#!/usr/bin/env python3
"""Validate curriculum IDs, generated hub content, and local Markdown links."""

import json
import re
from pathlib import Path

root = Path(__file__).resolve().parents[1]
items = json.loads((root / "curriculum.json").read_text())
assert len(items) == 190
assert len({item["id"] for item in items}) == len(items)
for item in items:
    assert (root / item["path"]).is_file(), item

for track, count in [("Kotlin", 120), ("Android", 40), ("KMP", 30)]:
    assert sum(item["track"] == track for item in items) == count

hub_html = (root / "progress.html").read_text()
embedded = re.search(r"const lessons = (.*);\n    const byId", hub_html).group(1)
hub_lessons = json.loads(embedded)
assert [
    {key: lesson[key] for key in ("id", "track", "level", "title", "path", "description")}
    for lesson in hub_lessons
] == items, "Hub and curriculum.json differ"
for lesson in hub_lessons:
    assert lesson["context"] and lesson["sections"] and lesson["files"], lesson["id"]
    assert all((root / link["path"]).is_file() for link in lesson["files"])
    assert not re.search(
        r"\b(?:hint|spoiler|reference|solution)\b|-Preference",
        " ".join([lesson["context"], *(part["body"] for part in lesson["sections"])]),
        re.IGNORECASE,
    ), f"Answer material leaked into hub: {lesson['id']}"
assert "__EMBEDDED_LESSONS__" not in hub_html

checked_links = 0
for document in root.rglob("*.md"):
    if any(part in {"build", ".gradle"} for part in document.parts):
        continue
    without_code = re.sub(r"```.*?```", "", document.read_text(), flags=re.DOTALL)
    for target in re.findall(r"\]\(([^)]+)\)", without_code):
        if "://" in target or target.startswith("#"):
            continue
        checked_links += 1
        path = target.split("#", 1)[0]
        assert (document.parent / path).exists(), f"Broken link in {document}: {target}"

print(f"Hub OK: 190 lessons, no answer material, {checked_links} local links.")
