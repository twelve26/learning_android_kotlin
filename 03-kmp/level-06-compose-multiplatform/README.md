# KMP 06 — Shared Compose interface

Compose Multiplatform shares UI descriptions across Android and iOS. Platform hosts still own application lifecycle and platform integrations. Decide which UI is worth sharing instead of assuming every screen should be shared.

Open this folder in Android Studio; open `iosApp/LearningApp.xcodeproj` in Xcode. Android and iOS are application targets; Android host tests provide fast JVM feedback without adding a desktop product.

## Stage order
- [M06.1 — Common composable](stages/01.md)
- [M06.2 — State and stable identity](stages/02.md)
- [M06.3 — iOS host controller](stages/03.md)
- [M06.4 — Adaptive and accessible UI](stages/04.md)
- [M06.5 — Final integration challenge](stages/05.md)

## Reference selection
Your files remain in `shared/src/commonMain/kotlin`. `-Preference` selects separate reference source, never overwriting learner code. Platform adapters are scaffolded in both modes so the workshop focuses on their boundary and tests. For Android Studio reference inspection, temporarily set `reference=true` in local gradle.properties and sync. For Xcode use `LAB_REFERENCE=YES`. Do not commit temporary settings.

## Commands
```sh
./gradlew :shared:testAndroidHostTest -Preference
./gradlew :shared:iosSimulatorArm64Test -Preference
./gradlew :androidApp:assembleDebug -Preference
```
Use a macOS machine with Xcode and an installed iOS simulator runtime for native tests. Device signing and store publication are outside the required free path.
