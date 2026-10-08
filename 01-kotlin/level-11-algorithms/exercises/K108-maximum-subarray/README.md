# K108 — Maximum subarray

## Mission
Return maximum nonempty contiguous sum as Long; null for empty input.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K108Test {
    @Test
    fun contract() {
        assertEquals(6L, maxSum(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(-1L, maxSum(listOf(-3, -1)))
        assertNull(maxSum(emptyList()))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-11-algorithms:test --tests "k108.K108Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K108Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

Measure cost against input size. A hash map trades space for lookup speed. Two pointers and sliding windows reuse work. State invariants before coding. Use Long for accumulated Int values and test duplicates, emptiness and extremes.
</details>
<details><summary>Hint 2 — key insight</summary>

At each position, either extend the previous segment or start a new one.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-11-algorithms:test --tests "k108.K108Test" -Preference
```
Read [reference code](../../reference/K108-maximum-subarray/Exercise.kt) after attempting the exercise.

**Why it works:** At each position, either extend the previous segment or start a new one.

## Transfer challenge
Write a straightforward slower oracle for small inputs and compare both implementations on deterministic generated cases.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K107-shortest-unweighted-route/README.md) · [Next exercise](../K109-coin-planner/README.md)
