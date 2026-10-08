# Level 03 — Functions and null safety

Functions turn explicit inputs into outputs. Nullable types use `?`; safe calls and Elvis handle absence. Default parameters and named arguments clarify calls. Do not turn invalid data into a plausible value unless the contract asks for it.

Prerequisite: Kotlin level 02.

## Exercise order
- [K021 — Safe nickname](exercises/K021-safe-nickname/README.md): Trim a nullable name. Use Guest if null or blank.
- [K022 — Safe quotient](exercises/K022-safe-quotient/README.md): Return null for zero denominator; otherwise floating-point quotient.
- [K023 — Port parser](exercises/K023-port-parser/README.md): Parse an integer in 1..65535 or return null; allow surrounding spaces.
- [K024 — Welcome defaults](exercises/K024-welcome-defaults/README.md): Return "Hello, name!" repeated times joined by a space. Defaults: name=Guest, times=1. times >= 0.
- [K025 — Nullable cart](exercises/K025-nullable-cart/README.md): Sum non-null prices as Long; empty or all-null carts cost zero.
- [K026 — Last extension](exercises/K026-last-extension/README.md): Return lowercase extension after the last dot, or null if dot missing, first, or last.
- [K027 — Clamp contract](exercises/K027-clamp-contract/README.md): Clamp x to inclusive min..max; reject min > max with IllegalArgumentException.
- [K028 — Factorial stack](exercises/K028-factorial-stack/README.md): Compute factorial for n in 0..20; reject other values.
- [K029 — Search fallback](exercises/K029-search-fallback/README.md): Return first nonblank trimmed string, or null.
- [K030 — Recursive folders](exercises/K030-recursive-folders/README.md): Sum a tree of nested integer lists represented by Node.

## Level gate
Run `./gradlew :level-03-functions:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
