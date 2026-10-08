# Level 12 — Interview and application challenges

Explain the contract, propose examples, choose a representation, implement, then inspect complexity. A working solution is only the start: discuss invalid inputs, resource limits, concurrency, persistence and observable behavior.

Prerequisite: Kotlin level 11.

## Exercise order
- [K111 — LRU request simulator](exercises/K111-lru-request-simulator/README.md): Simulate capacity >=0 cache; return cache misses. Access refreshes recency; evict least recently used.
- [K112 — Fixed-window limiter](exercises/K112-fixed-window-limiter/README.md): For nondecreasing nonnegative millisecond timestamps, accept at most limit requests per windowMs bucket. limit>=0, windowMs>0.
- [K113 — Optimistic conflict](exercises/K113-optimistic-conflict/README.md): Apply update only when expectedVersion equals current.version; increment version and return new document, otherwise null.
- [K114 — Idempotent events](exercises/K114-idempotent-events/README.md): Apply each event ID only once in arrival order and return Long balance. Duplicate IDs keep first event.
- [K115 — Cursor page](exercises/K115-cursor-page/README.md): For strictly ascending unique IDs, return up to size >=0 IDs greater than cursor; null cursor starts at beginning.
- [K116 — Search scoring](exercises/K116-search-scoring/README.md): Rank documents by number of query words present, ignoring case. Query words are distinct; omit zero scores. Break ties by ID.
- [K117 — Expiring cache](exercises/K117-expiring-cache/README.md): Return entries whose expiresAt is strictly greater than now. Preserve key/value pairs.
- [K118 — Undo machine](exercises/K118-undo-machine/README.md): Interpret +text as push, undo as pop, redo as restore. A new push clears redo. Return final stack. Reject other commands.
- [K119 — Offline reconciliation](exercises/K119-offline-reconciliation/README.md): Merge local and remote records by ID using highest revision; remote wins ties; sort output by ID. Tombstones remain.
- [K120 — Batch scheduler](exercises/K120-batch-scheduler/README.md): Greedily partition ordered positive task weights into batches of total <= limit. Reject a task heavier than limit.

## Level gate
Run `./gradlew :level-12-interviews:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
