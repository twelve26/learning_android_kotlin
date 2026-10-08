# K029 — Search fallback

## Mission
Return first nonblank trimmed string, or null.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K029Test {
    @Test
    fun contract() {
        assertEquals("Ada", firstName(listOf(null, " ", " Ada ", "Bob")))
        assertNull(firstName(emptyList()))
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-03-functions:test --tests "k029.K029Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K029Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

Functions turn explicit inputs into outputs. Nullable types use `?`; safe calls and Elvis handle absence. Default parameters and named arguments clarify calls. Do not turn invalid data into a plausible value unless the contract asks for it.
</details>
<details><summary>Hint 2 — key insight</summary>

Stop once a valid candidate exists.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-03-functions:test --tests "k029.K029Test" -Preference
```
Read [reference code](../../reference/K029-search-fallback/Exercise.kt) after attempting the exercise.

**Why it works:** Stop once a valid candidate exists.

## Transfer challenge
Change an absence policy from null to an explicit error. Update the contract and add tests showing callers cannot confuse failure with success.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K028-factorial-stack/README.md) · [Next exercise](../K030-recursive-folders/README.md)
