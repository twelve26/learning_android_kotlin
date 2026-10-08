# Android 03 — Profile form

A ViewModel outlives Activity recreation and exposes immutable UI state. StateFlow carries current state; collectAsStateWithLifecycle stops collection when UI is inactive. Validation belongs in pure functions.

Open **this folder** in Android Studio. Use the repository environment guide for SDK/JDK setup. Android applications are independent builds; there is no all-platform root build.

## Ordered stages
- [A03.1 — Unidirectional state](stages/01.md)
- [A03.2 — Keyboard and validation](stages/02.md)
- [A03.3 — Lifecycle-aware feedback](stages/03.md)
- [A03.4 — Test and explain lifetime](stages/04.md)

## Checkpoints and learner work
Your app lives in `app/src/main/kotlin`. References live in `app/reference` and are selected with `-Preference`; no copying or reset is required. `-Pcheckpoint=1` through `4` controls the reference features displayed. Reference source contains the whole baseline, so avoid opening it early if you want no spoilers.

Gradle CLI properties do not change Android Studio's selected sources. To inspect/run references in the IDE, temporarily add `reference=true` and `checkpoint=4` to this project's local `gradle.properties`, sync, then remove them to resume learner code. Do not commit that temporary change.

Run `./gradlew :app:assembleDebug` for a build-only check. `./gradlew :app:testDebugUnitTest -Preference` checks the reference domain contract. The starter intentionally fails domain tests until implemented but still launches.

## Review gate
Demonstrate every acceptance case, add behavioral tests, and explain ownership, lifecycle and one failure mode. Use the next level only after the gate, or record a deliberate skip in your progress notes.
