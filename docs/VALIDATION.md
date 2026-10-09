# Validation evidence

Validated on 2026-10-08 on an Apple Silicon Mac using Android Studio's JBR 25, Android SDK 36, an Android 17 Pixel 10 emulator, Xcode 27.0, iOS 26.5 and Gradle 9.4.1.

## Automated results

- All 120 Kotlin reference contract tests passed. Every unfinished Kotlin source and test source compiled separately.
- All ten Android learner starter APKs assembled. All ten reference APKs assembled and their domain unit tests passed.
- Instrumentation passed for all ten Android projects on the emulator. The suite includes launch smoke checks in every project and behavioral checks for counter restoration/bounds, navigation/search state, form validation, and deterministic network success/empty/failure states.
- All six KMP learner Android hosts and iOS simulator frameworks compiled.
- All six KMP Android host test suites passed. Their Android host applications assembled.
- All six KMP iOS simulator common test suites passed. All six checked-in Xcode hosts built for the arm64 simulator without signing, including the Swift observation/cancellation bridge and Compose Multiplatform host.
- The catalog checker found 190 unique linked units: 120 Kotlin, 40 Android and 30 KMP. It also verifies that `curriculum.json` and the generated hub catalog agree.
- The hub generator embeds learner-facing context, tasks, acceptance criteria, run commands, and working-file links. The checker verifies that all 190 units have content, that every embedded file link exists, and that answer-related content is excluded.
- The original progress dashboard was rendered and tested for search, completion persistence, notes, and JSON backup. The expanded hub passed JavaScript syntax and static content/link checks; its local-file UI was not visually tested because the integrated browser blocks `file:` URLs.
- 904 local Markdown links were resolved against the source tree with no missing targets.

## Deliberate limits

App Store/device signing, store publication, real cloud services and paid APIs were not tested because they are outside the free required route. The localhost HTTP exercise has deterministic fixture coverage; its optional live-server walkthrough remains a learner exercise. The supplied mobile references are teaching baselines, while tasks explicitly named extension, transfer or capstone integration require the learner's implementation and rubric evidence.

Android instrumentation uses AndroidX Test/Espresso 3.7.0 because that release supports current platform input APIs. The Xcode host is arm64 and targets iOS 17.2 or newer. Build tools emitted non-fatal deprecation/configuration notices; upgrades should be handled as a compatible version set and followed by the full matrix in `MAINTAINING.md`.
