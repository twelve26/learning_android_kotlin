# K034 — Inventory merge

## Mission
Sum quantities for matching keys without mutating either input.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K034Test {
    @Test
    fun contract() {
        assertEquals(mapOf("a" to 5, "b" to 1), merge(mapOf("a" to 2), mapOf("a" to 3, "b" to 1)))
        assertEquals(emptyMap(), merge(emptyMap(), emptyMap()))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-04-collections:test --tests "k034.K034Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K034Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

The union of keys is the complete result domain.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-04-collections:test --tests "k034.K034Test" -Preference
```
Read [reference code](../../reference/K034-inventory-merge/Exercise.kt) after attempting the exercise.

**Why it works:** The union of keys is the complete result domain.

## Transfer challenge
Solve the same contract without mutating input collections. Then compare eager lists with a sequence on a large deterministic input.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K033-top-scores/README.md) · [Next exercise](../K035-page-windows/README.md)
