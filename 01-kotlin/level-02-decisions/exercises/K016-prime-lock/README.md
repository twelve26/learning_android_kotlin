# K016 — Prime lock

## Mission
Return true exactly when n is prime.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K016Test {
    @Test
    fun contract() {
        assertFalse(prime(1))
        assertTrue(prime(2))
        assertFalse(prime(49))
        assertTrue(prime(97))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-02-decisions:test --tests "k016.K016Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K016Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

An `if` or `when` can produce a value. Ranges describe sequences; loops repeat work. Keep an invariant: a statement that remains true after each iteration. Validate boundaries before the happy path.
</details>
<details><summary>Hint 2 — key insight</summary>

Search up to the square root using division to avoid d*d overflow.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-02-decisions:test --tests "k016.K016Test" -Preference
```
Read [reference code](../../reference/K016-prime-lock/Exercise.kt) after attempting the exercise.

**Why it works:** Search up to the square root using division to avoid d*d overflow.

## Transfer challenge
Replace the convenient collection helper with an explicit loop (or the loop with a helper). State the invariant and compare readability.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K015-digit-inventory/README.md) · [Next exercise](../K017-stair-builder/README.md)
