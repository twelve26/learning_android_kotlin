# K101 — Two sum

## Mission
Return indices i<j whose values sum to target, choosing earliest j then earliest i; null if absent. Avoid quadratic search.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K101Test {
    @Test
    fun contract() {
        assertEquals(0 to 1, twoSum(listOf(3, 3), 6))
        assertEquals(0 to 2, twoSum(listOf(2, 7, 9), 11))
        assertNull(twoSum(listOf(Int.MAX_VALUE, 1), Int.MIN_VALUE))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-11-algorithms:test --tests "k101.K101Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K101Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Store prior values only, guaranteeing different indices and O(n) expected time.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-11-algorithms:test --tests "k101.K101Test" -Preference
```
Read [reference code](../../reference/K101-two-sum/Exercise.kt) after attempting the exercise.

**Why it works:** Store prior values only, guaranteeing different indices and O(n) expected time.

## Transfer challenge
Write a straightforward slower oracle for small inputs and compare both implementations on deterministic generated cases.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../../../level-10-flows/exercises/K100-take-bounded-stream/README.md) · [Next exercise](../K102-binary-lookup/README.md)
