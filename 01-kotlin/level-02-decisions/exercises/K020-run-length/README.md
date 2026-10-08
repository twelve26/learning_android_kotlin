# K020 — Run length

## Mission
Return longest consecutive run of true values.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K020Test {
    @Test
    fun contract() {
        assertEquals(0, longest(emptyList()))
        assertEquals(3, longest(listOf(true, true, false, true, true, true)))
        assertEquals(0, longest(listOf(false)))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-02-decisions:test --tests "k020.K020Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K020Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

An `if` or `when` can produce a value. Ranges describe sequences; loops repeat work. Keep an invariant: a statement that remains true after each iteration. Validate boundaries before the happy path.
</details>
<details><summary>Hint 2 — key insight</summary>

Reset current at false while preserving the global best.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-02-decisions:test --tests "k020.K020Test" -Preference
```
Read [reference code](../../reference/K020-run-length/Exercise.kt) after attempting the exercise.

**Why it works:** Reset current at false while preserving the global best.

## Transfer challenge
Replace the convenient collection helper with an explicit loop (or the loop with a helper). State the invariant and compare readability.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K019-first-alarm/README.md) · [Next exercise](../../../level-03-functions/exercises/K021-safe-nickname/README.md)
