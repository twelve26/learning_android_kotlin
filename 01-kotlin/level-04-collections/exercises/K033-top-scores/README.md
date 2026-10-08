# K033 — Top scores

## Mission
Return up to k largest values descending, retaining duplicates; k >= 0.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K033Test {
    @Test
    fun contract() {
        assertEquals(listOf(9, 9), top(listOf(3, 9, 9, 4), 2))
        assertEquals(emptyList(), top(listOf(1), 0))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-04-collections:test --tests "k033.K033Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K033Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

Lists preserve order and duplicates, sets express uniqueness, and maps associate keys with values. `map` transforms, `filter` selects, `fold` accumulates. Empty collections are valid inputs. Read-only interfaces do not imply deep immutability.
</details>
<details><summary>Hint 2 — key insight</summary>

Sorting is simple but costs O(n log n); later compare a bounded heap.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-04-collections:test --tests "k033.K033Test" -Preference
```
Read [reference code](../../reference/K033-top-scores/Exercise.kt) after attempting the exercise.

**Why it works:** Sorting is simple but costs O(n log n); later compare a bounded heap.

## Transfer challenge
Solve the same contract without mutating input collections. Then compare eager lists with a sequence on a large deterministic input.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K032-word-census/README.md) · [Next exercise](../K034-inventory-merge/README.md)
