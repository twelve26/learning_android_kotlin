# K087 — Mutex ledger

## Mission
Run n concurrent increments safely and return n; n >= 0.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K087Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(100, increments(100))
            assertEquals(0, increments(0))
        }
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-09-coroutines:test --tests "k087.K087Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K087Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

A coroutine belongs to a scope. Suspending releases a thread while waiting. Child work is awaited and cancelled with its parent. `async` returns Deferred; `launch` returns Job. Tests use virtual time; avoid Thread.sleep and global scopes.
</details>
<details><summary>Hint 2 — key insight</summary>

Mutual exclusion protects the whole read-modify-write sequence, even across suspension.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-09-coroutines:test --tests "k087.K087Test" -Preference
```
Read [reference code](../../reference/K087-mutex-ledger/Exercise.kt) after attempting the exercise.

**Why it works:** Mutual exclusion protects the whole read-modify-write sequence, even across suspension.

## Transfer challenge
Cancel the operation halfway through a virtual-time test. Verify child work stops and cleanup happens without swallowing cancellation.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K086-cancellation-cleanup/README.md) · [Next exercise](../K088-supervisor-fallback/README.md)
