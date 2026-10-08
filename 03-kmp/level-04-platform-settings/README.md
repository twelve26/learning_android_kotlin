# KMP 04 — Platform settings boundary

expect/actual declares a shared contract with platform-specific implementation. Prefer an interface for dependencies requiring runtime context; use expect/actual only where the platform boundary is stable.

Open this folder in Android Studio; open `iosApp/LearningApp.xcodeproj` in Xcode. Android and iOS are application targets; Android host tests provide fast JVM feedback without adding a desktop product.

## Stage order
- [M04.1 — Platform identity](stages/01.md)
- [M04.2 — Storage interface](stages/02.md)
- [M04.3 — Android implementation](stages/03.md)
- [M04.4 — iOS implementation](stages/04.md)
- [M04.5 — Boundary tests](stages/05.md)

## Reference selection
Your files remain in `shared/src/commonMain/kotlin`. `-Preference` selects separate reference source, never overwriting learner code. Platform adapters are scaffolded in both modes so the workshop focuses on their boundary and tests. For Android Studio reference inspection, temporarily set `reference=true` in local gradle.properties and sync. For Xcode use `LAB_REFERENCE=YES`. Do not commit temporary settings.

## Commands
```sh
./gradlew :shared:testAndroidHostTest -Preference
./gradlew :shared:iosSimulatorArm64Test -Preference
./gradlew :androidApp:assembleDebug -Preference
```
Use a macOS machine with Xcode and an installed iOS simulator runtime for native tests. Device signing and store publication are outside the required free path.
