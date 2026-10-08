# K110 — Dependency order

## Mission
Return a topological order for graph keys and neighbors, or null for a cycle. Edges go prerequisite -> dependent.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K110Test {
    @Test
    fun contract() {
        assertEquals(
            listOf("a", "b", "c"),
            order(linkedMapOf("a" to listOf("b"), "b" to listOf("c"))),
        )
        assertNull(order(mapOf("a" to listOf("b"), "b" to listOf("a"))))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-11-algorithms:test --tests "k110.K110Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K110Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

Measure cost against input size. A hash map trades space for lookup speed. Two pointers and sliding windows reuse work. State invariants before coding. Use Long for accumulated Int values and test duplicates, emptiness and extremes.
</details>
<details><summary>Hint 2 — key insight</summary>

Kahn’s algorithm removes zero-indegree vertices; remaining vertices imply a cycle.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-11-algorithms:test --tests "k110.K110Test" -Preference
```
Read [reference code](../../reference/K110-dependency-order/Exercise.kt) after attempting the exercise.

**Why it works:** Kahn’s algorithm removes zero-indegree vertices; remaining vertices imply a cycle.

## Transfer challenge
Write a straightforward slower oracle for small inputs and compare both implementations on deterministic generated cases.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K109-coin-planner/README.md) · [Next exercise](../../../level-12-interviews/exercises/K111-lru-request-simulator/README.md)
