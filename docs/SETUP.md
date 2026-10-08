# Environment setup

## Required tools
- Android Studio with Android SDK Platform 36, build tools, platform tools and an ARM64 Android emulator image (API 35 or 36 is sufficient to run these minSdk 26 apps).
- JDK 17 or newer compatible with the pinned Gradle. This repository was built using Android Studio's bundled JBR 25; Gradle Wrapper is pinned to 9.4.1. Kotlin/Java bytecode targets 17.
- For iOS: an Apple Silicon Mac, Xcode, command-line tools and an installed iOS simulator runtime. Apple Silicon uses iosSimulatorArm64. Physical-device signing is optional.
- Python 3 only for the optional local fixture server and maintenance verification scripts.

## 1. Configure Java and Android SDK
In Android Studio, choose its bundled JDK under Settings → Build Tools → Gradle. In a macOS terminal with the default installation:
```sh
export JAVA_HOME="/Applications/Android Studio.app/Contents/jbr/Contents/Home"
export ANDROID_HOME="$HOME/Library/Android/sdk"
export PATH="$JAVA_HOME/bin:$ANDROID_HOME/platform-tools:$PATH"
java -version
```
These exports affect the current terminal only. If Studio is installed elsewhere, use its actual JDK path. Do not commit machine-specific SDK paths. Android Studio may create a local.properties file, which Git ignores.

Open SDK Manager and install Platform 36. Open Device Manager, create an ARM64 virtual device and boot it. `adb devices` should list it as `device`, not `offline`. A physical Android device with USB debugging is also supported.

## 2. Prove Kotlin works
From repository root:
```sh
cd 01-kotlin
./gradlew :level-01-values:test --tests 'k001.K001Test' -Preference
```
This reference should pass. Repeat without `-Preference`: the intentional TODO should fail. You now know both the environment and the exercise feedback loop work.

The Wrapper downloads a pinned Gradle distribution once, then dependencies. Global Gradle or kotlinc installations are unnecessary. Offline mode works only after all required artifacts have been cached.

## 3. Run Android
Open `02-android/level-01-habit-counter` in Android Studio. Select app and a booted device, then Run. The starter shows a workshop canvas. From that project folder:
```sh
./gradlew :app:assembleDebug
./gradlew :app:installDebug
```
Installing does not automatically bring the app to the foreground: tap its launcher icon. To try the baseline:
```sh
./gradlew :app:installDebug -Preference -Pcheckpoint=4
```
Installing a reference replaces the installed starter for that project; source files are untouched. Each project has its own app ID. Restore the starter by reinstalling without the reference flag.

## 4. Prepare iOS
Open Xcode once and finish its platform installation. In Xcode Settings → Components, install an iOS simulator runtime. Confirm:
```sh
xcode-select -p
xcodebuild -version
xcrun simctl list devices available
```
The selected developer directory should point to Xcode, not only CommandLineTools. If it does not, change it using Xcode's Locations settings.

## 5. Run KMP
From a KMP project folder:
```sh
./gradlew :shared:testAndroidHostTest -Preference
./gradlew :shared:iosSimulatorArm64Test -Preference
./gradlew :androidApp:installDebug -Preference
open iosApp/LearningApp.xcodeproj
```
Select the LearningApp scheme and an iPhone simulator in Xcode. The first build compiles Shared.framework through a checked-in build phase. No CocoaPods or XcodeGen is required. To run the reference, set target Build Settings → User-Defined → LAB_REFERENCE to YES; NO uses learner sources.

If Xcode cannot find Java, add a user-defined JAVA_HOME build setting with your JDK path, or launch Xcode from a terminal whose environment is configured. Framework compilation may download Kotlin/Native dependencies the first time. Read and investigate compatibility warnings; do not silence them blindly.

The checked-in iOS host targets iOS 17.2 or newer and arm64 (Apple Silicon simulator / physical device). Intel simulator support is not configured.

Simulator use needs no paid Apple Developer subscription. App Store publication is not a course prerequisite.

## Version policy
Versions are pinned in checked-in build files. They are a tested teaching baseline, not a claim to be the latest releases. Upgrade Gradle, AGP, Kotlin and Compose as a compatible set, then rerun the matrix in MAINTAINING.md. Official compatibility references are linked in REFERENCES.md.
