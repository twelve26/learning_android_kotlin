# K071 — Reified filter

## Mission
Implement a generic runtime type filter preserving order.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K071Test {
    @Test
    fun contract() {
        assertEquals(listOf(1, 2), select<Int>(listOf(1, "a", null, 2)))
        assertEquals(listOf("a"), select<String>(listOf(1, "a")))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-08-design:test --tests "k071.K071Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K071Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

An API should make legal operations obvious. Delegates intercept property access, inline reified parameters preserve runtime type checks, and receiver lambdas create DSLs. Equality and hashing must agree. Document ownership and mutability.
</details>
<details><summary>Hint 2 — key insight</summary>

Reified type parameters are available to runtime is checks in inline functions.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-08-design:test --tests "k071.K071Test" -Preference
```
Read [reference code](../../reference/K071-reified-filter/Exercise.kt) after attempting the exercise.

**Why it works:** Reified type parameters are available to runtime is checks in inline functions.

## Transfer challenge
Design a caller that misuses the API. Improve visibility, ownership or type constraints to make that misuse harder.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../../../level-07-robustness/exercises/K070-resource-lifetime/README.md) · [Next exercise](../K072-read-only-snapshot/README.md)
