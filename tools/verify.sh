#!/bin/sh
# Run from any directory. Reference mode never overwrites learner files.
set -eu
ROOT=$(CDPATH= cd -- "$(dirname -- "$0")/.." && pwd)
MODE=${1:-kotlin}
python3 "$ROOT/tools/check_catalog.py"
case "$MODE" in
 kotlin) cd "$ROOT/01-kotlin"; ./gradlew test -Preference ;;
 android) for project in "$ROOT"/02-android/level-*; do (cd "$project" && ./gradlew :app:assembleDebug :app:testDebugUnitTest -Preference); done ;;
 kmp) for project in "$ROOT"/03-kmp/level-*; do (cd "$project" && ./gradlew :shared:testAndroidHostTest :androidApp:assembleDebug -Preference); done ;;
 ios) for project in "$ROOT"/03-kmp/level-*; do (cd "$project" && ./gradlew :shared:iosSimulatorArm64Test -Preference); done ;;
 *) echo "Usage: tools/verify.sh kotlin|android|kmp|ios" >&2; exit 2 ;;
esac
