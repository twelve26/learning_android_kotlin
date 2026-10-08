# KMP 01 — Shared pricing

commonMain can depend only on APIs available to every declared target. Share business rules and keep platform UI in Android Compose and SwiftUI. Integer cents avoid accidental floating-point money rounding.

Open this folder in Android Studio; open `iosApp/LearningApp.xcodeproj` in Xcode. Android and iOS are application targets; Android host tests provide fast JVM feedback without adding a desktop product.

## Stage order
- [M01.1 — Trace source sets](stages/01.md)
- [M01.2 — Shared arithmetic](stages/02.md)
- [M01.3 — Common tests](stages/03.md)
- [M01.4 — Native UI integration](stages/04.md)
- [M01.5 — Contract evolution](stages/05.md)

## Reference selection
Your files remain in `shared/src/commonMain/kotlin`. `-Preference` selects separate reference source, never overwriting learner code. Platform adapters are scaffolded in both modes so the workshop focuses on their boundary and tests. For Android Studio reference inspection, temporarily set `reference=true` in local gradle.properties and sync. For Xcode use `LAB_REFERENCE=YES`. Do not commit temporary settings.

## Commands
```sh
./gradlew :shared:testAndroidHostTest -Preference
./gradlew :shared:iosSimulatorArm64Test -Preference
./gradlew :androidApp:assembleDebug -Preference
```
Use a macOS machine with Xcode and an installed iOS simulator runtime for native tests. Device signing and store publication are outside the required free path.
