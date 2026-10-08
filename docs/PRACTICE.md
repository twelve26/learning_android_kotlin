# How to practice

## A first exercise, step by step
1. Open K001 from GUIDE.md. Read its exact output format.
2. Locate Exercise.kt. A function signature names its inputs and output type; TODO is an intentional placeholder that throws when called.
3. Open the matching test. `assertEquals(expected, actual)` compares the required result with your function's result.
4. Run the README command once before editing. Confirm the failure names K001, rather than an SDK or dependency problem.
5. Replace TODO with your implementation. Save and run the same command.
6. If it fails, compare whitespace, capitalization and boundary assumptions. Use the debugger to inspect values.
7. Add one more example. Only then compare the reference and write one sentence explaining your choice.
8. Mark the exercise in progress.html. Move on when you can explain the behavior.

## Hints without giving up the exercise
Try to produce a failing example first. Hint 1 supplies a concept; Hint 2 points toward the important decision; Hint 3 reveals implementation direction. Reading a solution is useful only if you subsequently close it and reproduce the reasoning on a new input.

## Mobile stages
Read acceptance criteria as a test plan. Implement one visible behavior at a time. Use Preview for layout iteration, a running app for lifecycle/platform behavior, local unit tests for pure rules and device tests for actual platform integration. Do not confuse a launch smoke test with feature coverage.

Keep changes in Git after each completed stage:
```sh
git add path/to/the/project
git commit -m "Complete A01.1 counter interaction"
```
Do not commit local.properties, credentials, signing keys, generated build output or exported personal progress. Review `git diff --cached` first.

## Productive difficulty
After completing a level, revisit two exercises without hints. If you can only reproduce memorized syntax, change the input contract and solve again. If a later stage blocks you, run its reference baseline to isolate environment versus implementation issues; record the skip and return later.

## Interview mode
Choose a Kotlin level 11–12 problem. Restate assumptions, write examples, describe a straightforward solution and its cost, implement, test boundaries, and discuss a more demanding variant. Then practice an application design question from ASSESSMENT.md. No time limit is required; add one only after correctness becomes comfortable.
