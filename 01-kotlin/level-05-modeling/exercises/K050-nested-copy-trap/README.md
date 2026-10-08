# K050 — Nested copy trap

## Mission
Return a new Board with an added card without mutating the original mutable list.

## Executable examples
These assertions give concrete input/output examples. The full test file is editable so you can add cases.

```kotlin
class K050Test {
    @Test
    fun contract() {
        val b = Board(mutableListOf("a"))
        val c = add(b, "b")
        c.cards.add("c")
        assertEquals(listOf("a"), b.cards)
        assertEquals(listOf("a", "b", "c"), c.cards)
    }
}
```

## Before you start
Read [this level](../../README.md). Work in `Exercise.kt` beside this README. The supporting types are intentionally small; inspect their contracts too.

## Run and verify
From `01-kotlin/`:
```sh
./gradlew :level-05-modeling:test --tests "k050.K050Test"
```
The starter compiles but fails with `NotImplementedError`. Make the contract pass, then add at least one boundary case to `tests/K050Test.kt`. Tests are visible so you can inspect exact examples; passing them is evidence, not proof for all inputs.

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

copy() alone would share the list; copy the mutable boundary explicitly.
</details>
<details><summary>Hint 3 — implementation direction (spoiler)</summary>

Trace the executable examples above by hand. Write intermediate values beside each operation. If the trace is still unclear, open the separate reference linked below and explain each line before rerunning it.
</details>

## Reference, without changing your work
```sh
./gradlew :level-05-modeling:test --tests "k050.K050Test" -Preference
```
Read [reference code](../../reference/K050-nested-copy-trap/Exercise.kt) after attempting the exercise.

**Why it works:** copy() alone would share the list; copy the mutable boundary explicitly.

## Transfer challenge
Introduce an invalid state deliberately, then redesign the model or factory so it cannot be constructed. Add a rejection test.

## Completion
- [ ] Original contract passes.
- [ ] Added boundary case passes.
- [ ] Can explain the key insight without reading code.
- [ ] Compared the reference and recorded one observation.

[Previous exercise](../K049-stable-ranking/README.md) · [Next exercise](../../../level-06-functional/exercises/K051-slug-extension/README.md)
