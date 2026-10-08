# K115 — Cursor page

## Mission
For strictly ascending unique IDs, return up to size >=0 IDs greater than cursor; null cursor starts at beginning.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K115Test {
    @Test
    fun contract() {
        assertEquals(listOf(5L, 9L), page(listOf(1L, 3L, 5L, 9L), 3, 2))
        assertEquals(emptyList(), page(listOf(1L), 1, 2))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-12-interviews:test --tests "k115.K115Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K115Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

Explain the contract, propose examples, choose a representation, implement, then inspect complexity. A working solution is only the start: discuss invalid inputs, resource limits, concurrency, persistence and observable behavior.
</details>
<details><summary>Hint 2 — key insight</summary>

An exclusive cursor avoids repeating the previous page’s final item.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-12-interviews:test --tests "k115.K115Test" -Preference
```
Read [reference code](../../reference/K115-cursor-page/Exercise.kt) after attempting the exercise.

**Why it works:** An exclusive cursor avoids repeating the previous page’s final item.

## Transfer challenge
Extend the problem with one application constraint: persistence, concurrent callers, bounded memory or duplicate delivery. State the new invariants and test them.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K114-idempotent-events/README.md) · [Next exercise](../K116-search-scoring/README.md)
