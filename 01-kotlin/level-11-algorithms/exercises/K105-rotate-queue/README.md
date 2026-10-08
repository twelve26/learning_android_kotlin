# K105 — Rotate queue

## Mission
Rotate right by nonnegative k, preserving duplicates.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K105Test {
    @Test
    fun contract() {
        assertEquals(listOf(3, 1, 2), rotate(listOf(1, 2, 3), 4))
        assertEquals(emptyList(), rotate(emptyList(), 5))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-11-algorithms:test --tests "k105.K105Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K105Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Normalize k before slicing and handle empty input before modulo.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-11-algorithms:test --tests "k105.K105Test" -Preference
```
Read [reference code](../../reference/K105-rotate-queue/Exercise.kt) after attempting the exercise.

**Why it works:** Normalize k before slicing and handle empty input before modulo.

## Transfer challenge
Write a straightforward slower oracle for small inputs and compare both implementations on deterministic generated cases.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K104-unique-window/README.md) · [Next exercise](../K106-anagram-groups/README.md)
