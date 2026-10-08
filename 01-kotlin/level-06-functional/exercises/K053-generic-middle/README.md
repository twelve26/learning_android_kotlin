# K053 — Generic middle

## Mission
Return middle element at size/2, or null for empty input.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K053Test {
    @Test
    fun contract() {
        assertEquals("b", middle(listOf("a", "b", "c")))
        assertEquals(2, middle(listOf(1, 2)))
        assertNull(middle(emptyList<Int>()))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-06-functional:test --tests "k053.K053Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K053Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

A generic result retains its input element type.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-06-functional:test --tests "k053.K053Test" -Preference
```
Read [reference code](../../reference/K053-generic-middle/Exercise.kt) after attempting the exercise.

**Why it works:** A generic result retains its input element type.

## Transfer challenge
Reuse the abstraction with a different type or supplied function. Check evaluation count and order with a side-effect counter in the test.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K052-function-pipeline/README.md) · [Next exercise](../K054-predicate-audit/README.md)
