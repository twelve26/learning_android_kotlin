# K093 — Stream balance

## Mission
Emit initial zero then running Long sum.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K093Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(listOf(0L, 3L, 2L), balance(flowOf(3, -1)).toList())
            assertEquals(listOf(0L), balance(emptyFlow()).toList())
        }
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-10-flows:test --tests "k093.K093Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K093Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

A stateful operator can emit its initial state before receiving input.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-10-flows:test --tests "k093.K093Test" -Preference
```
Read [reference code](../../reference/K093-stream-balance/Exercise.kt) after attempting the exercise.

**Why it works:** A stateful operator can emit its initial state before receiving input.

## Transfer challenge
Add a test with rapid emissions and explain exactly which values should be observable. Do not depend on wall-clock sleeps.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K092-clean-readings/README.md) · [Next exercise](../K094-first-available/README.md)
