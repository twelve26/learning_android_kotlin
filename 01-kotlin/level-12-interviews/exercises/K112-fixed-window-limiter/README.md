# K112 — Fixed-window limiter

## Mission
For nondecreasing nonnegative millisecond timestamps, accept at most limit requests per windowMs bucket. limit>=0, windowMs>0.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K112Test {
    @Test
    fun contract() {
        assertEquals(listOf(true, true, false, true), admit(listOf(0, 1, 9, 10), 2, 10))
        assertEquals(listOf(false), admit(listOf(0), 0, 1))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-12-interviews:test --tests "k112.K112Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K112Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Window boundaries matter; compare with a sliding-window limiter in the extension.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-12-interviews:test --tests "k112.K112Test" -Preference
```
Read [reference code](../../reference/K112-fixed-window-limiter/Exercise.kt) after attempting the exercise.

**Why it works:** Window boundaries matter; compare with a sliding-window limiter in the extension.

## Transfer challenge
Extend the problem with one application constraint: persistence, concurrent callers, bounded memory or duplicate delivery. State the new invariants and test them.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K111-lru-request-simulator/README.md) · [Next exercise](../K113-optimistic-conflict/README.md)
