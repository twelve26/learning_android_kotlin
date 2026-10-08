# Level 10 — Flow and reactive state

A cold Flow runs for each collector. StateFlow holds current state and conflates equal values. Operators transform streams; cancellation stops upstream work. Choose buffering and latest semantics intentionally. Virtual-time tests make time-dependent behavior reproducible.

Prerequisite: Kotlin level 09.

## Exercise order
- [K091 — Cold sensor](exercises/K091-cold-sensor/README.md): Emit each supplied reading only when collected.
- [K092 — Clean readings](exercises/K092-clean-readings/README.md): Keep nonnegative values, double them, remove adjacent duplicates.
- [K093 — Stream balance](exercises/K093-stream-balance/README.md): Emit initial zero then running Long sum.
- [K094 — First available](exercises/K094-first-available/README.md): Return first non-null value or null when source completes without one.
- [K095 — Recover transport](exercises/K095-recover-transport/README.md): On IOException emit cached; other exceptions must propagate.
- [K096 — Latest search](exercises/K096-latest-search/README.md): For each query run search; cancel obsolete searches.
- [K097 — Debounced typing](exercises/K097-debounced-typing/README.md): Emit typing values only after 100 ms of silence; final pending value is emitted on completion.
- [K098 — Combine form](exercises/K098-combine-form/README.md): Combine latest name and accepted flag into validity: nonblank name and true flag.
- [K099 — State update](exercises/K099-state-update/README.md): Apply a delta atomically to MutableStateFlow<Int>.
- [K100 — Take bounded stream](exercises/K100-take-bounded-stream/README.md): Collect at most n values from an infinite counter; n >= 0.

## Level gate
Run `./gradlew :level-10-flows:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
