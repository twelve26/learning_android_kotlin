# K060 — Map values selectively

## Mission
Transform only values whose keys satisfy predicate; preserve all keys.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K060Test {
    @Test
    fun contract() {
        assertEquals(
            mapOf("a" to 2, "b" to 3),
            update(mapOf("a" to 1, "b" to 3), { it == "a" }, { it + 1 }),
        )
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-06-functional:test --tests "k060.K060Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K060Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

Functions can be values. Extensions add call syntax without changing the receiver. Scope functions differ by receiver and return value. Generics preserve type relationships; variance controls substitutability. Favor readability over chaining.
</details>
<details><summary>Hint 2 — key insight</summary>

Destructuring map entries names both parts without index access.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-06-functional:test --tests "k060.K060Test" -Preference
```
Read [reference code](../../reference/K060-map-values-selectively/Exercise.kt) after attempting the exercise.

**Why it works:** Destructuring map entries names both parts without index access.

## Transfer challenge
Reuse the abstraction with a different type or supplied function. Check evaluation count and order with a side-effect counter in the test.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K059-zip-contract/README.md) · [Next exercise](../../../level-07-robustness/exercises/K061-strict-coordinates/README.md)
