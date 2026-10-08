# K116 — Search scoring

## Mission
Rank documents by number of query words present, ignoring case. Query words are distinct; omit zero scores. Break ties by ID.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K116Test {
    @Test
    fun contract() {
        assertEquals(
            listOf(2, 1),
            search(
                mapOf(1 to "kotlin", 2 to "kotlin android", 3 to "swift"),
                "Android kotlin kotlin",
            ),
        )
        assertEquals(emptyList(), search(mapOf(1 to "a"), ""))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-12-interviews:test --tests "k116.K116Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K116Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Deduplicate query tokens before scoring so repeated terms do not distort relevance.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-12-interviews:test --tests "k116.K116Test" -Preference
```
Read [reference code](../../reference/K116-search-scoring/Exercise.kt) after attempting the exercise.

**Why it works:** Deduplicate query tokens before scoring so repeated terms do not distort relevance.

## Transfer challenge
Extend the problem with one application constraint: persistence, concurrent callers, bounded memory or duplicate delivery. State the new invariants and test them.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K115-cursor-page/README.md) · [Next exercise](../K117-expiring-cache/README.md)
