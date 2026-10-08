# Maintaining the laboratory

Run tools/check_catalog.py for catalog integrity. Use tools/verify.sh kotlin, android, kmp or ios for reference checks. The iOS suite requires an installed simulator runtime. These commands compile learner projects only when the reference flag is removed; unfinished learner tests are expected to fail.

A complete release check includes: Kotlin references; Kotlin starter compilation; every Android starter/reference assembly; every Android domain reference test; KMP common tests on Android and iOS; Android host assemblies; Xcode simulator host builds; launch/interaction smoke checks; dashboard persistence/export/import; and local link validation.

Reference and learner modes must never compile together. Test changing modes in both directions. A project property selects source directories; do not copy solutions into learner folders to validate them.

Do not claim unexecuted device checks passed. Record actual tooling, commands, outcomes and limitations in VALIDATION.md. Do not commit local paths from local.properties, credentials, build artifacts, simulator data or personal dashboard exports.

Keep fixtures deterministic and free. Any future external API exercise must have a local fixture path and distinguish transport failures from exercise failures. Review upgrade compatibility before changing pinned versions.
