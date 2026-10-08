# K001 — Parcel labels

## Mission
Return "Parcel #<id>: <name>" with name unchanged.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K001Test {
    @Test
    fun contract() {
        assertEquals("Parcel #7: Tea", label(7, "Tea"))
        assertEquals("Parcel #0: ", label(0, ""))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-01-values:test --tests "k001.K001Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K001Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

String templates embed expressions without manual concatenation.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-01-values:test --tests "k001.K001Test" -Preference
```
Read [reference code](../../reference/K001-parcel-labels/Exercise.kt) after attempting the exercise.

**Why it works:** String templates embed expressions without manual concatenation.

## Transfer challenge
Extend the label with an optional destination. Define exact punctuation when it is absent, then add tests before implementing.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Next exercise](../K002-cinema-receipt/README.md)
