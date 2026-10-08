# Assessment and integration rubrics

## Kotlin level gate
All original contracts and at least one learner-added boundary test per exercise pass. Explain null handling, complexity and mutation for two selected exercises. For concurrency levels, prove cancellation and deterministic virtual-time behavior; wall-clock sleeps are not accepted evidence.

## Android stage gate
Demonstrate each acceptance walkthrough on a running app. Unit tests cover pure policy; device tests cover selected platform behaviors. State ownership and lifetime are explained. Accessibility and error behavior count as functionality, not optional polish.

## Android capstone rubric
Build an offline task board with multiple stable-ID tasks. Use domain/data/UI modules, a durable database, an outbox of pending operations, a fake transport with failure injection and WorkManager for retryable synchronization. No external service is required.

Required demonstrations:
1. Create and edit offline, force-stop, relaunch: changes remain.
2. Delete offline, sync an older remote snapshot: deletion remains.
3. Apply one remote event twice: no duplicate effect.
4. Fail the first transport request, retry later: outbox drains exactly once.
5. Cancel/leave a screen: no leaked collector or stale navigation event.
6. Rotate and enlarge fonts: usable layout and correctly scoped state.
7. Test a real database migration from an old schema fixture.
8. Measure startup and list scrolling on a named device/build type; report numbers and methodology rather than claiming performance from intuition.

The supplied single-record reference is a merge-policy baseline, not this finished capstone. Your architecture note must explain conflict policy, durability, transaction boundaries, retry bounds and remaining limitations.

## KMP capstone rubric
Build an offline reading tracker with Android and iOS hosts, shared domain/repository code, explicit platform storage and lifecycle-aware observation. Choose native or shared Compose UI and defend that decision.

Required demonstrations: common contract tests on both targets; platform persistence after relaunch; cancellation of observation; failure/retry using a deterministic transport; accessibility checks using TalkBack/VoiceOver; no platform imports in common code except common library APIs.

## Interview discussion prompts
- Why does a read-only List not guarantee immutable elements?
- How can coroutine cancellation be accidentally swallowed?
- What survives recomposition, Activity recreation and process death?
- How do you prevent duplicate mutations after retries?
- What can common tests prove, and what needs platform tests?
- When would you keep an iOS UI native rather than share Compose?
- How would you migrate a database without losing existing user data?
- Which measurements justify adding a cache or changing an algorithm?

Evaluate explanations using correctness, explicit assumptions, failure handling, test evidence and simplicity. There is no required architecture acronym or dependency-injection framework.
