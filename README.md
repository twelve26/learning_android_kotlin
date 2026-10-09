# Learning Android, Kotlin & KMP

An English, exercise-first laboratory for learning from fundamentals through application architecture and interview practice. No previous language or mobile experience is assumed. The route is self-paced: completion means demonstrated behavior and explained decisions, not time spent.

**120 Kotlin puzzles · 40 Android stages · 30 Kotlin Multiplatform stages**

## Start here
1. Read [environment setup](docs/SETUP.md).
2. Follow [the complete ordered guide](GUIDE.md).
3. Start the [offline lesson hub](progress.html) with `python3 tools/start_hub.py` from this folder. It opens a local page with one-click tests for Kotlin level 01. To browse lessons without test buttons, you can still open `progress.html` directly.
4. Solve **K001** and run its test before continuing.

## The learning loop
Read the mission → predict examples → implement → run tests → inspect feedback → request a hint only if needed → explain your solution → compare the separate reference → mark progress.

Kotlin exercises compile with intentional `TODO()` failures. Android and KMP host apps launch before exercises are solved. All learner code is separate from reference code. `-Preference` selects references during a Gradle build; it never copies over your work.

## Tracks
- [Kotlin](01-kotlin/README.md): 12 levels, 10 distinct exercises each, with visible automated contracts.
- [Android](02-android/README.md): 10 independent Compose projects, 4 stages each. One isolated View interoperability lab.
- [KMP](03-kmp/README.md): 6 independent Android+iOS projects, 5 stages each. Native UI first, shared Compose UI last.

There is intentionally no root Gradle build. Open a track/project folder as explained in its README. This keeps ordinary Kotlin practice independent of Android SDK and Xcode configuration.

## Expectations and honest boundaries
Reference solutions for Kotlin are complete contract implementations. Mobile references are working teaching baselines; advanced tasks explicitly labelled extension, transfer or capstone require additional learner design and integration. Checkpoints are not production-ready applications. See [assessment rubrics](docs/ASSESSMENT.md) and [validation evidence](docs/VALIDATION.md).

Everything required uses local fixtures, platform tools or free dependencies. Initial dependency downloads require internet. No login, credit card, paid API, store account or cloud backend is needed. Publishing to stores and optional paid services are outside the required route.

## Helpful pages
- [How to practice](docs/PRACTICE.md)
- [Troubleshooting](docs/TROUBLESHOOTING.md)
- [Glossary](docs/GLOSSARY.md)
- [Official references](docs/REFERENCES.md)
- [Maintaining and verifying the course](docs/MAINTAINING.md)

The hub contains every lesson's task, context, acceptance criteria, run commands and links to working files. Hints and answers are not embedded. Progress is private to the browser profile and this file origin. Export backups before moving the folder or switching browsers. Completion is self-reported, not automatic proof that tests passed.

The local runner uses only Python's standard library, binds to `127.0.0.1`, and accepts only K001–K010 test IDs. It invokes the fixed Gradle test for the selected exercise and shows its output in the hub. Stop it with Ctrl+C. Opening `progress.html` as a file and opening it through the runner use different browser storage origins, so export/import a progress backup when switching between them.
