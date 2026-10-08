# K090 — Bounded parallelism

## Mission
Map concurrently with at most limit > 0 transforms active. Preserve order.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K090Test {
    @Test
    fun contract() {
        runTest {
            var active = 0
            var peak = 0
            assertEquals(
                listOf(1, 2, 3, 4),
                limited(listOf(1, 2, 3, 4), 2) {
                    active++
                    peak = maxOf(peak, active)
                    delay(10)
                    active--
                    it
                },
            )
            assertEquals(2, peak)
            assertEquals(20L, currentTime)
        }
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-09-coroutines:test --tests "k090.K090Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K090Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

A semaphore bounds active work; it does not bound the number of allocated child coroutines.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-09-coroutines:test --tests "k090.K090Test" -Preference
```
Read [reference code](../../reference/K090-bounded-parallelism/Exercise.kt) after attempting the exercise.

**Why it works:** A semaphore bounds active work; it does not bound the number of allocated child coroutines.

## Transfer challenge
Cancel the operation halfway through a virtual-time test. Verify child work stops and cleanup happens without swallowing cancellation.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K089-dispatcher-injection/README.md) · [Next exercise](../../../level-10-flows/exercises/K091-cold-sensor/README.md)
