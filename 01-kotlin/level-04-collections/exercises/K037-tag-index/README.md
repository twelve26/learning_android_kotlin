# K037 — Tag index

## Mission
Invert document-to-tags into tag-to-document-list in input iteration order; duplicate tags count once per document.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K037Test {
    @Test
    fun contract() {
        assertEquals(
            mapOf("k" to listOf("a", "b")),
            invert(linkedMapOf("a" to listOf("k", "k"), "b" to listOf("k"))),
        )
        assertEquals(emptyMap(), invert(emptyMap()))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-04-collections:test --tests "k037.K037Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K037Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Flatten relationships, then regroup around the opposite key.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-04-collections:test --tests "k037.K037Test" -Preference
```
Read [reference code](../../reference/K037-tag-index/Exercise.kt) after attempting the exercise.

**Why it works:** Flatten relationships, then regroup around the opposite key.

## Transfer challenge
Solve the same contract without mutating input collections. Then compare eager lists with a sequence on a large deterministic input.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K036-adjacent-changes/README.md) · [Next exercise](../K038-running-balance/README.md)
