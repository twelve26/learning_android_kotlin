# K097 — Debounced typing

## Mission
Emit typing values only after 100 ms of silence; final pending value is emitted on completion.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K097Test {
    @Test
    fun contract() {
        runTest {
            val f = flow {
                emit("a")
                delay(20)
                emit("ab")
                delay(120)
                emit("abc")
            }
            assertEquals(listOf("ab", "abc"), typing(f).toList())
        }
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-10-flows:test --tests "k097.K097Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K097Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

A cold Flow runs for each collector. StateFlow holds current state and conflates equal values. Operators transform streams; cancellation stops upstream work. Choose buffering and latest semantics intentionally. Virtual-time tests make time-dependent behavior reproducible.
</details>
<details><summary>Hint 2 — key insight</summary>

Debouncing suppresses transient input; completion flushes the pending value.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-10-flows:test --tests "k097.K097Test" -Preference
```
Read [reference code](../../reference/K097-debounced-typing/Exercise.kt) after attempting the exercise.

**Why it works:** Debouncing suppresses transient input; completion flushes the pending value.

## Transfer challenge
Add a test with rapid emissions and explain exactly which values should be observable. Do not depend on wall-clock sleeps.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K096-latest-search/README.md) · [Next exercise](../K098-combine-form/README.md)
