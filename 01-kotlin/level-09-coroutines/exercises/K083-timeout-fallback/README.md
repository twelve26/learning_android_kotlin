# K083 — Timeout fallback

## Mission
Return supplier result within 100 ms, or null on timeout.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K083Test {
    @Test
    fun contract() {
        runTest {
            assertNull(
                bounded {
                    delay(101)
                    "late"
                }
            )
            assertEquals("ok", bounded { "ok" })
        }
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-09-coroutines:test --tests "k083.K083Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K083Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

A timeout is scoped cancellation; the nullable API explicitly chooses a fallback.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-09-coroutines:test --tests "k083.K083Test" -Preference
```
Read [reference code](../../reference/K083-timeout-fallback/Exercise.kt) after attempting the exercise.

**Why it works:** A timeout is scoped cancellation; the nullable API explicitly chooses a fallback.

## Transfer challenge
Cancel the operation halfway through a virtual-time test. Verify child work stops and cleanup happens without swallowing cancellation.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K082-parallel-quotes/README.md) · [Next exercise](../K084-retry-io/README.md)
