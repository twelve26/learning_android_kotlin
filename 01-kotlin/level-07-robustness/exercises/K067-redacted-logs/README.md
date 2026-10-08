# K067 — Redacted logs

## Mission
Replace values for case-insensitive password or token keys with [REDACTED]. Preserve keys and other values.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K067Test {
    @Test
    fun contract() {
        assertEquals(
            mapOf("Token" to "[REDACTED]", "id" to "7"),
            redact(mapOf("Token" to "secret", "id" to "7")),
        )
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-07-robustness:test --tests "k067.K067Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K067Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

## Suggested process
1. Restate the contract using one normal and one boundary example.
2. Decide which inputs require validation and which are preconditions.
3. Implement the smallest correct solution without reading the reference.
4. Run the test, inspect the first failing assertion, and revise.
5. Explain time/space cost and one tradeoff aloud.

<details><summary>Hint 1 — representation</summary>

Parsing converts untrusted representations into domain values. Validate before indexing. Exceptions, nullable returns and Result communicate different contracts. Handle expected failures narrowly; cancellation is not a business error.
</details>
<details><summary>Hint 2 — key insight</summary>

Sanitize at a boundary; this exact-key rule is not a universal secret detector.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-07-robustness:test --tests "k067.K067Test" -Preference
```
Read [reference code](../../reference/K067-redacted-logs/Exercise.kt) after attempting the exercise.

**Why it works:** Sanitize at a boundary; this exact-key rule is not a universal secret detector.

## Transfer challenge
Create three malformed inputs and decide whether each is rejected or normalized. Document this before editing the implementation.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K066-balanced-delimiters/README.md) · [Next exercise](../K068-bounded-integer/README.md)
