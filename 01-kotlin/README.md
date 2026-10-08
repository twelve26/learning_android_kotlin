# Kotlin laboratory

Open this folder in Android Studio or IntelliJ IDEA. Run one exercise using the exact command in its README. The `-Preference` flag selects separate completed reference files.

- [Level 01: Values, types and expressions](level-01-values/README.md)
- [Level 02: Decisions and repetition](level-02-decisions/README.md)
- [Level 03: Functions and null safety](level-03-functions/README.md)
- [Level 04: Collections and transformations](level-04-collections/README.md)
- [Level 05: Modeling and state](level-05-modeling/README.md)
- [Level 06: Higher-order Kotlin](level-06-functional/README.md)
- [Level 07: Parsing, errors and boundaries](level-07-robustness/README.md)
- [Level 08: APIs, generics and DSLs](level-08-design/README.md)
- [Level 09: Structured concurrency](level-09-coroutines/README.md)
- [Level 10: Flow and reactive state](level-10-flows/README.md)
- [Level 11: Algorithms and data structures](level-11-algorithms/README.md)
- [Level 12: Interview and application challenges](level-12-interviews/README.md)

## Fast loop
```sh
./gradlew :level-01-values:test --tests 'k001.K001Test'
```
The first run should fail with `NotImplementedError`. Edit the exercise file, rerun, and inspect the expected/actual assertion if it fails differently. Run all learner tests only when ready; unfinished exercises are supposed to fail.

```sh
./gradlew test -Preference    # all completed references
./gradlew compileKotlin       # compile all learner starters
```
Test reports are inside each level's `build/reports/tests/test/index.html`.
