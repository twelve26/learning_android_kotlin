# K041 — Immutable promotion

## Mission
Return a copy of User with premium=true; preserve original.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K041Test {
    @Test
    fun contract() {
        val u = User("Ada", false)
        assertEquals(User("Ada", true), promote(u))
        assertFalse(u.premium)
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-05-modeling:test --tests "k041.K041Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K041Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

Data classes represent values. Sealed types represent a closed set of alternatives. Interfaces describe capabilities. Keep invalid states out of constructors, separate identity from display text, and prefer explicit state transitions.
</details>
<details><summary>Hint 2 — key insight</summary>

Data-class copy creates a new outer object; nested mutable members would still be shared.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-05-modeling:test --tests "k041.K041Test" -Preference
```
Read [reference code](../../reference/K041-immutable-promotion/Exercise.kt) after attempting the exercise.

**Why it works:** Data-class copy creates a new outer object; nested mutable members would still be shared.

## Transfer challenge
Introduce an invalid state deliberately, then redesign the model or factory so it cannot be constructed. Add a rejection test.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../../../level-04-collections/exercises/K040-catalog-join/README.md) · [Next exercise](../K042-money-boundary/README.md)
