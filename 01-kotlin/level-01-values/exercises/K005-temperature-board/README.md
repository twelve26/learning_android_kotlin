# K005 — Temperature board

## Mission
Convert Celsius to Fahrenheit with fractional precision.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K005Test {
    @Test
    fun contract() {
        assertEquals(32.0, fahrenheit(0.0))
        assertEquals(-40.0, fahrenheit(-40.0))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-01-values:test --tests "k005.K005Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K005Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

A value has a type. `val` prevents reassignment; `var` permits it. Arithmetic on Int truncates division and can overflow. Strings support templates. Write small expressions and observe exact outputs.
</details>
<details><summary>Hint 2 — key insight</summary>

Floating-point operands preserve the fractional ratio.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-01-values:test --tests "k005.K005Test" -Preference
```
Read [reference code](../../reference/K005-temperature-board/Exercise.kt) after attempting the exercise.

**Why it works:** Floating-point operands preserve the fractional ratio.

## Transfer challenge
Change one numeric result to a wider range. Add an extreme input test and explain where conversion must happen.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K004-remaining-seats/README.md) · [Next exercise](../K006-clock-display/README.md)
