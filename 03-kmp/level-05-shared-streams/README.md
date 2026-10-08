# KMP 05 — Shared streams and lifecycle

StateFlow shares current state. Swift interop needs a deliberate observation boundary and a cancellation handle. A screen leaving must stop collection; shared scope ownership must be explicit.

Open this folder in Android Studio; open `iosApp/LearningApp.xcodeproj` in Xcode. Android and iOS are application targets; Android host tests provide fast JVM feedback without adding a desktop product.

## Stage order
- [M05.1 — Shared state producer](stages/01.md)
- [M05.2 — Android observation](stages/02.md)
- [M05.3 — Swift observation bridge](stages/03.md)
- [M05.4 — Cancellation ownership](stages/04.md)
- [M05.5 — Conflation and errors](stages/05.md)

## Reference selection
Your files remain in `shared/src/commonMain/kotlin`. `-Preference` selects separate reference source, never overwriting learner code. Platform adapters are scaffolded in both modes so the workshop focuses on their boundary and tests. For Android Studio reference inspection, temporarily set `reference=true` in local gradle.properties and sync. For Xcode use `LAB_REFERENCE=YES`. Do not commit temporary settings.

## Commands
```sh
./gradlew :shared:testAndroidHostTest -Preference
./gradlew :shared:iosSimulatorArm64Test -Preference
./gradlew :androidApp:assembleDebug -Preference
```
Use a macOS machine with Xcode and an installed iOS simulator runtime for native tests. Device signing and store publication are outside the required free path.
