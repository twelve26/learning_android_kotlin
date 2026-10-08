# K088 — Supervisor fallback

## Mission
Run both suppliers independently; convert IOException to 0 per child and sum. Other exceptions propagate.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K088Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(
                7,
                resilient(
                    { throw java.io.IOException() },
                    {
                        delay(20)
                        7
                    },
                ),
            )
            assertFailsWith<CancellationException> {
                resilient({ throw CancellationException() }, { 2 })
            }
        }
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-09-coroutines:test --tests "k088.K088Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K088Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Supervision separates child failure propagation; each expected failure still needs an explicit policy.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-09-coroutines:test --tests "k088.K088Test" -Preference
```
Read [reference code](../../reference/K088-supervisor-fallback/Exercise.kt) after attempting the exercise.

**Why it works:** Supervision separates child failure propagation; each expected failure still needs an explicit policy.

## Transfer challenge
Cancel the operation halfway through a virtual-time test. Verify child work stops and cleanup happens without swallowing cancellation.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K087-mutex-ledger/README.md) · [Next exercise](../K089-dispatcher-injection/README.md)
