#!/usr/bin/env python3
"""Build the fully offline lesson hub from the existing curriculum Markdown.

Only learner-facing sections are embedded. Hints, reference implementations,
and solution explanations stay in their original files outside the hub.
"""

import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
CURRICULUM = json.loads((ROOT / "curriculum.json").read_text())

VISIBLE = {
    "Kotlin": (
        "Mission",
        "Before you start",
        "Run and verify",
        "Suggested process",
        "Transfer challenge",
        "Completion",
    ),
    "Android": (
        "Prerequisites",
        "Concept in context",
        "Build this",
        "Acceptance walkthrough",
        "Files and contracts",
        "Run (from this project folder)",
        "Explain before moving on",
        "Done",
    ),
    "KMP": (
        "Concept",
        "Prerequisites",
        "Mission",
        "Observable completion",
        "Where to work",
        "Run",
        "Review",
    ),
}

LEVEL_CONTEXT = {
    "Kotlin": "01-kotlin",
    "Android": "02-android",
    "KMP": "03-kmp",
}


def sections(markdown: str) -> dict[str, str]:
    """Return level-two sections, omitting all expandable hint blocks."""
    output = {}
    current = None
    lines = []
    inside_details = False
    for line in markdown.splitlines():
        if line.startswith("<details>"):
            inside_details = True
            continue
        if line.startswith("</details>"):
            inside_details = False
            continue
        if inside_details:
            continue
        if line.startswith("## "):
            if current:
                output[current] = "\n".join(lines).strip()
            current = line[3:].strip()
            lines = []
        elif current:
            lines.append(line)
    if current:
        output[current] = "\n".join(lines).strip()
    return output


def clean_for_hub(body: str) -> str:
    """Keep the instructions, but omit navigation to spoiler/reference content."""
    lines = []
    for line in body.splitlines():
        if any(
            word in line.lower()
            for word in (
                "reference",
                "-preference",
                "hint",
                "solution",
                "spoiler",
            )
        ):
            continue
        # Level READMEs have paths relative to themselves; show their labels
        # as text here, and provide verified links separately in the Files box.
        line = re.sub(r"\[([^\]]+)\]\([^)]+\)", r"\1", line)
        lines.append(line)
    return "\n".join(lines).strip()


def project_root(item: dict) -> Path:
    lesson = ROOT / item["path"]
    if item["track"] == "Kotlin":
        return lesson.parents[2]
    return lesson.parents[1]


def file_links(item: dict) -> list[dict[str, str]]:
    project = project_root(item)
    lesson = ROOT / item["path"]
    if item["track"] == "Kotlin":
        files = [
            ("Exercise", lesson.parent / "Exercise.kt"),
            ("Test", project / "tests" / f"{item['id']}Test.kt"),
            ("Level overview", project / "README.md"),
        ]
    elif item["track"] == "Android":
        files = [
            ("Screen", project / "app/src/main/kotlin/MainActivity.kt"),
            ("Domain contract", project / "app/src/main/kotlin/Domain.kt"),
            ("Domain test", project / "app/src/test/kotlin/DomainTest.kt"),
            ("UI test", project / "app/src/androidTest/kotlin/LaunchTest.kt"),
            ("Project overview", project / "README.md"),
        ]
    else:
        files = [
            ("Shared contract", project / "shared/src/commonMain/kotlin/Domain.kt"),
            ("Shared facade", project / "shared/src/commonMain/kotlin/CourseFacade.kt"),
            ("Shared test", project / "shared/src/commonTest/kotlin/DomainTest.kt"),
            ("Android host", project / "androidApp/src/main/kotlin/MainActivity.kt"),
            ("iOS host", project / "iosApp/App.swift"),
            ("Project overview", project / "README.md"),
        ]
    files.insert(0, ("Lesson", lesson))
    return [
        {"label": label, "path": path.relative_to(ROOT).as_posix()}
        for label, path in files
        if path.is_file()
    ]


def level_context(item: dict) -> str:
    project = project_root(item)
    text = (project / "README.md").read_text()
    # Kotlin level overviews provide the actual beginner explanation.
    if item["track"] == "Kotlin":
        return text.split("## Exercise order", 1)[0].split("\n", 1)[1].strip()
    return text.split("## ", 1)[0].split("\n", 1)[1].strip()


def build() -> None:
    lessons = []
    for item in CURRICULUM:
        source = sections((ROOT / item["path"]).read_text())
        visible = [
            {"title": name, "body": clean_for_hub(source[name])}
            for name in VISIBLE[item["track"]]
            if name in source and clean_for_hub(source[name])
        ]
        lessons.append(
            {
                **item,
                "context": clean_for_hub(level_context(item)),
                "sections": visible,
                "files": file_links(item),
            }
        )
    assert len(lessons) == 190
    for lesson in lessons:
        assert lesson["sections"] and lesson["files"], lesson["id"]
        assert all((ROOT / link["path"]).is_file() for link in lesson["files"])

    data = json.dumps(lessons, ensure_ascii=False, separators=(",", ":"))
    data = data.replace("<", "\\u003c").replace(">", "\\u003e")
    html = (ROOT / "tools/hub-template.html").read_text().replace(
        "__EMBEDDED_LESSONS__", data
    )
    (ROOT / "progress.html").write_text(html)
    print(f"Built offline hub with {len(lessons)} lessons and no reference code.")


if __name__ == "__main__":
    build()
