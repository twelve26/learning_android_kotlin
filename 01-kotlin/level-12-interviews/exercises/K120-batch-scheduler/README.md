# K120 — Batch scheduler

## Mission
Greedily partition ordered positive task weights into batches of total <= limit. Reject a task heavier than limit.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K120Test {
    @Test
    fun contract() {
        assertEquals(listOf(listOf(2, 3), listOf(4, 1)), batches(listOf(2, 3, 4, 1), 5))
        assertEquals(emptyList(), batches(emptyList(), 5))
        assertFailsWith<IllegalArgumentException> { batches(listOf(6), 5) }
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-12-interviews:test --tests "k120.K120Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K120Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Preserving order distinguishes this task from bin packing. Defend the greedy boundary rule.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-12-interviews:test --tests "k120.K120Test" -Preference
```
Read [reference code](../../reference/K120-batch-scheduler/Exercise.kt) after attempting the exercise.

**Why it works:** Preserving order distinguishes this task from bin packing. Defend the greedy boundary rule.

## Transfer challenge
Extend the problem with one application constraint: persistence, concurrent callers, bounded memory or duplicate delivery. State the new invariants and test them.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K119-offline-reconciliation/README.md)
