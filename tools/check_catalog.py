#!/usr/bin/env python3
"""Validate curriculum IDs, dashboard data, and local Markdown links."""

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

embedded = re.search(
    r"const catalog=(.*);\nconst key=", (root / "progress.html").read_text()
).group(1)
assert json.loads(embedded) == items, "Dashboard and curriculum.json differ"

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

print(
    f"Catalog OK: 190 unique learning units and {checked_links} local Markdown links."
)
