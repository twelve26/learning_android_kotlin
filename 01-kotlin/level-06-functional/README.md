# Level 06 — Higher-order Kotlin

Functions can be values. Extensions add call syntax without changing the receiver. Scope functions differ by receiver and return value. Generics preserve type relationships; variance controls substitutability. Favor readability over chaining.

Prerequisite: Kotlin level 05.

## Exercise order
- [K051 — Slug extension](exercises/K051-slug-extension/README.md): Create String.slug(): lowercase ASCII words joined by hyphens; treat non-alphanumeric runs as separators and trim hyphens.
- [K052 — Function pipeline](exercises/K052-function-pipeline/README.md): Apply operations left to right to an initial Int.
- [K053 — Generic middle](exercises/K053-generic-middle/README.md): Return middle element at size/2, or null for empty input.
- [K054 — Predicate audit](exercises/K054-predicate-audit/README.md): Return true only if every rule accepts value; no rules means true.
- [K055 — Lazy first match](exercises/K055-lazy-first-match/README.md): Transform until the first non-null result, without evaluating later elements.
- [K056 — Compose validators](exercises/K056-compose-validators/README.md): Return a function applying f then g.
- [K057 — Scoped builder](exercises/K057-scoped-builder/README.md): Run a receiver lambda on a new StringBuilder and return its text.
- [K058 — Memoized square](exercises/K058-memoized-square/README.md): Return a cached function; compute each distinct input once.
- [K059 — Zip contract](exercises/K059-zip-contract/README.md): Combine equal-sized lists using a function; reject different sizes instead of truncating.
- [K060 — Map values selectively](exercises/K060-map-values-selectively/README.md): Transform only values whose keys satisfy predicate; preserve all keys.

## Level gate
Run `./gradlew :level-06-functional:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
