# K040 — Catalog join

## Mission
Join IDs with available names; omit missing IDs and retain request order and duplicates.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K040Test {
    @Test
    fun contract() {
        assertEquals(listOf("B", "A", "B"), join(listOf(2, 9, 1, 2), mapOf(1 to "A", 2 to "B")))
        assertEquals(emptyList(), join(emptyList(), emptyMap()))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-04-collections:test --tests "k040.K040Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K040Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Use the requested IDs as the iteration source.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-04-collections:test --tests "k040.K040Test" -Preference
```
Read [reference code](../../reference/K040-catalog-join/Exercise.kt) after attempting the exercise.

**Why it works:** Use the requested IDs as the iteration source.

## Transfer challenge
Solve the same contract without mutating input collections. Then compare eager lists with a sequence on a large deterministic input.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K039-partition-queue/README.md) · [Next exercise](../../../level-05-modeling/exercises/K041-immutable-promotion/README.md)
