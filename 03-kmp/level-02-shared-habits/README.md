# KMP 02 — Shared habit reducer

A reducer is a pure state machine shared across platforms. Keep UI lifecycle outside the reducer and use stable identifiers. State snapshots should not expose mutable collections.

Open this folder in Android Studio; open `iosApp/LearningApp.xcodeproj` in Xcode. Android and iOS are application targets; Android host tests provide fast JVM feedback without adding a desktop product.

## Stage order
- [M02.1 — Model valid state](stages/01.md)
- [M02.2 — Reducer transitions](stages/02.md)
- [M02.3 — Replay and invariants](stages/03.md)
- [M02.4 — Host ownership](stages/04.md)
- [M02.5 — Interview extension](stages/05.md)

## Reference selection
Your files remain in `shared/src/commonMain/kotlin`. `-Preference` selects separate reference source, never overwriting learner code. Platform adapters are scaffolded in both modes so the workshop focuses on their boundary and tests. For Android Studio reference inspection, temporarily set `reference=true` in local gradle.properties and sync. For Xcode use `LAB_REFERENCE=YES`. Do not commit temporary settings.

## Commands
```sh
./gradlew :shared:testAndroidHostTest -Preference
./gradlew :shared:iosSimulatorArm64Test -Preference
./gradlew :androidApp:assembleDebug -Preference
```
Use a macOS machine with Xcode and an installed iOS simulator runtime for native tests. Device signing and store publication are outside the required free path.
