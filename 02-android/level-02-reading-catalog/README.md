# Android 02 — Reading catalog

Stable IDs connect lists, navigation and detail screens. A back stack is different from a Boolean flag. Keep transient query state saveable and pass IDs rather than full mutable objects.

Open **this folder** in Android Studio. Use the repository environment guide for SDK/JDK setup. Android applications are independent builds; there is no all-platform root build.

## Ordered stages
- [A02.1 — Stable lazy list](stages/01.md)
- [A02.2 — Search and empty state](stages/02.md)
- [A02.3 — Navigation and back](stages/03.md)
- [A02.4 — Saveable detail state](stages/04.md)

## Checkpoints and learner work
Your app lives in `app/src/main/kotlin`. References live in `app/reference` and are selected with `-Preference`; no copying or reset is required. `-Pcheckpoint=1` through `4` controls the reference features displayed. Reference source contains the whole baseline, so avoid opening it early if you want no spoilers.

Gradle CLI properties do not change Android Studio's selected sources. To inspect/run references in the IDE, temporarily add `reference=true` and `checkpoint=4` to this project's local `gradle.properties`, sync, then remove them to resume learner code. Do not commit that temporary change.

Run `./gradlew :app:assembleDebug` for a build-only check. `./gradlew :app:testDebugUnitTest -Preference` checks the reference domain contract. The starter intentionally fails domain tests until implemented but still launches.

## Review gate
Demonstrate every acceptance case, add behavioral tests, and explain ownership, lifecycle and one failure mode. Use the next level only after the gate, or record a deliberate skip in your progress notes.
