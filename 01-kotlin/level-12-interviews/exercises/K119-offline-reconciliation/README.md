# K119 — Offline reconciliation

## Mission
Merge local and remote records by ID using highest revision; remote wins ties; sort output by ID. Tombstones remain.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K119Test {
    @Test
    fun contract() {
        assertEquals(
            listOf(Record(1, 2, true)),
            reconcile(listOf(Record(1, 1, false)), listOf(Record(1, 2, true))),
        )
        assertEquals(
            listOf(Record(1, 2, true)),
            reconcile(listOf(Record(1, 2, false)), listOf(Record(1, 2, true))),
        )
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-12-interviews:test --tests "k119.K119Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K119Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Deletion must be represented as data or an old replica can resurrect removed records.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-12-interviews:test --tests "k119.K119Test" -Preference
```
Read [reference code](../../reference/K119-offline-reconciliation/Exercise.kt) after attempting the exercise.

**Why it works:** Deletion must be represented as data or an old replica can resurrect removed records.

## Transfer challenge
Extend the problem with one application constraint: persistence, concurrent callers, bounded memory or duplicate delivery. State the new invariants and test them.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K118-undo-machine/README.md) · [Next exercise](../K120-batch-scheduler/README.md)
