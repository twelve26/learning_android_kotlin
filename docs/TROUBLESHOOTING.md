# Troubleshooting by symptom

| Symptom | Diagnose | Fix |
|---|---|---|
| Gradle cannot find Java | `java -version`, print JAVA_HOME | Select Studio's bundled JDK; configure terminal separately. |
| SDK location not found | SDK Manager and ANDROID_HOME | Export correct SDK path or let Studio create ignored local.properties. |
| Dependency download fails | Check network/proxy and Gradle error URL | Retry with network; offline mode cannot fetch missing artifacts. |
| NotImplementedError | Check test and Exercise.kt | Expected starter failure: implement the exercise. |
| Reference test runs TODO | Check spelling of `-Preference` | Use capital P Gradle project property; run from the correct project. |
| No tests found | Compare package/class to exercise README | Use exact `--tests 'k001.K001Test'`; avoid a path as a test filter. |
| Android device missing | `adb devices` | Boot an emulator or authorize USB debugging. |
| App built but not visible | Installation and launcher | `installDebug` installs; tap its icon to launch. |
| Preview passes but device fails | Reproduce on device | Preview does not exercise all lifecycle, permissions or services. |
| Xcode cannot find Shared | Inspect first failing Gradle build phase | Fix Java/SDK/Gradle error first; do not add arbitrary framework paths. |
| Native tests have no destination | `xcrun simctl list devices available` | Install an iOS simulator runtime through Xcode. |
| KMP compiler warns about Xcode | Check compatibility guide | Use a supported pair or document the actually verified result. |
| Hub progress appears reset | Browser/profile/file path changed | Import your exported JSON backup. |
| Browser blocks local storage | Hub shows warning | Start `python3 tools/start_hub.py` and use its local URL; export progress first. |
| Fixture HTTP fails | Server terminal and port 8765 | Use 10.0.2.2 from Android emulator, localhost from iOS simulator. |

Never delete learner sources or reset Git to fix a build. Generated build directories can be regenerated, but investigate the first error before cleaning everything.

## Local hub runner
From repository root:
```sh
python3 tools/start_hub.py
```
The command prints and opens its local URL. It serves the hub, enables Kotlin level 01 test buttons, and uses a separate browser storage origin from `file:`. Export/import progress if you switch. Stop with Ctrl+C. If port 8766 is busy, pass `--port 8767`. The server binds only to `127.0.0.1`.
