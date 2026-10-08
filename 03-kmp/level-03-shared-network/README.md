# KMP 03 — Shared network repository

Ktor exposes a common HTTP API while engines provide platform transport. MockEngine tests requests without accounts or network. Serialize at the boundary and keep transport details out of the domain.

Open this folder in Android Studio; open `iosApp/LearningApp.xcodeproj` in Xcode. Android and iOS are application targets; Android host tests provide fast JVM feedback without adding a desktop product.

## Stage order
- [M03.1 — Serialization boundary](stages/01.md)
- [M03.2 — Inject HTTP client](stages/02.md)
- [M03.3 — Failure contracts](stages/03.md)
- [M03.4 — Platform engines](stages/04.md)
- [M03.5 — Offline extension](stages/05.md)

## Reference selection
Your files remain in `shared/src/commonMain/kotlin`. `-Preference` selects separate reference source, never overwriting learner code. Platform adapters are scaffolded in both modes so the workshop focuses on their boundary and tests. For Android Studio reference inspection, temporarily set `reference=true` in local gradle.properties and sync. For Xcode use `LAB_REFERENCE=YES`. Do not commit temporary settings.

## Commands
```sh
./gradlew :shared:testAndroidHostTest -Preference
./gradlew :shared:iosSimulatorArm64Test -Preference
./gradlew :androidApp:assembleDebug -Preference
```
Use a macOS machine with Xcode and an installed iOS simulator runtime for native tests. Device signing and store publication are outside the required free path.
