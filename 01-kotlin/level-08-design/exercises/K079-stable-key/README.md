# K079 — Stable key

## Mission
Return a set of case-insensitive ASCII identifiers, normalized using lowercase.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K079Test {
    @Test
    fun contract() {
        assertEquals(setOf("abc"), keys(listOf("ABC", "abc")))
        assertEquals(emptySet(), keys(emptyList()))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-08-design:test --tests "k079.K079Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K079Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

Canonicalize before hashing; custom equality would need matching hashCode.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-08-design:test --tests "k079.K079Test" -Preference
```
Read [reference code](../../reference/K079-stable-key/Exercise.kt) after attempting the exercise.

**Why it works:** Canonicalize before hashing; custom equality would need matching hashCode.

## Transfer challenge
Design a caller that misuses the API. Improve visibility, ownership or type constraints to make that misuse harder.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K078-contravariant-sink/README.md) · [Next exercise](../K080-java-boundary/README.md)
