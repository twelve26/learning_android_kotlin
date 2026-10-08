# K114 — Idempotent events

## Mission
Apply each event ID only once in arrival order and return Long balance. Duplicate IDs keep first event.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K114Test {
    @Test
    fun contract() {
        assertEquals(7L, ledger(listOf(Event("a", 5), Event("a", 9), Event("b", 2))))
        assertEquals(0L, ledger(emptyList()))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-12-interviews:test --tests "k114.K114Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K114Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Idempotency is based on event identity, not equal payloads.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-12-interviews:test --tests "k114.K114Test" -Preference
```
Read [reference code](../../reference/K114-idempotent-events/Exercise.kt) after attempting the exercise.

**Why it works:** Idempotency is based on event identity, not equal payloads.

## Transfer challenge
Extend the problem with one application constraint: persistence, concurrent callers, bounded memory or duplicate delivery. State the new invariants and test them.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K113-optimistic-conflict/README.md) · [Next exercise](../K115-cursor-page/README.md)
