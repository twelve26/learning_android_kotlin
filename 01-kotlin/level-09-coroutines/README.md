# Level 09 — Structured concurrency

A coroutine belongs to a scope. Suspending releases a thread while waiting. Child work is awaited and cancelled with its parent. `async` returns Deferred; `launch` returns Job. Tests use virtual time; avoid Thread.sleep and global scopes.

Prerequisite: Kotlin level 08.

## Exercise order
- [K081 — Suspend greeting](exercises/K081-suspend-greeting/README.md): Wait 100 virtual milliseconds then return Hello. Do not block a thread.
- [K082 — Parallel quotes](exercises/K082-parallel-quotes/README.md): Call both suspending suppliers concurrently and return sum. Child failure must propagate.
- [K083 — Timeout fallback](exercises/K083-timeout-fallback/README.md): Return supplier result within 100 ms, or null on timeout.
- [K084 — Retry IO](exercises/K084-retry-io/README.md): Try block up to attempts > 0 times; retry only IOException, propagate final error and cancellation.
- [K085 — Ordered parallel map](exercises/K085-ordered-parallel-map/README.md): Run each transform concurrently but retain input order. Intended for small bounded input.
- [K086 — Cancellation cleanup](exercises/K086-cancellation-cleanup/README.md): Suspend until cancelled; always call cleanup exactly once.
- [K087 — Mutex ledger](exercises/K087-mutex-ledger/README.md): Run n concurrent increments safely and return n; n >= 0.
- [K088 — Supervisor fallback](exercises/K088-supervisor-fallback/README.md): Run both suppliers independently; convert IOException to 0 per child and sum. Other exceptions propagate.
- [K089 — Dispatcher injection](exercises/K089-dispatcher-injection/README.md): Execute block using the supplied CoroutineDispatcher.
- [K090 — Bounded parallelism](exercises/K090-bounded-parallelism/README.md): Map concurrently with at most limit > 0 transforms active. Preserve order.

## Level gate
Run `./gradlew :level-09-coroutines:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
