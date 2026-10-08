# Level 08 — APIs, generics and DSLs

An API should make legal operations obvious. Delegates intercept property access, inline reified parameters preserve runtime type checks, and receiver lambdas create DSLs. Equality and hashing must agree. Document ownership and mutability.

Prerequisite: Kotlin level 07.

## Exercise order
- [K071 — Reified filter](exercises/K071-reified-filter/README.md): Implement a generic runtime type filter preserving order.
- [K072 — Read-only snapshot](exercises/K072-read-only-snapshot/README.md): Return a defensive list copy that is unaffected by later changes to input.
- [K073 — Lazy settings](exercises/K073-lazy-settings/README.md): Return a Lazy value that evaluates loader at most once on successful access.
- [K074 — Observable score](exercises/K074-observable-score/README.md): Create Score whose value setter reports old and new values through callback.
- [K075 — Route DSL](exercises/K075-route-dsl/README.md): Build routes using receiver lambda; reject duplicate paths and non-absolute paths.
- [K076 — Operator vector](exercises/K076-operator-vector/README.md): Return a+b using an operator overload on Vector.
- [K077 — Covariant producer](exercises/K077-covariant-producer/README.md): Read a Dog producer through an Animal producer parameter.
- [K078 — Contravariant sink](exercises/K078-contravariant-sink/README.md): Send every Dog to a Consumer<Dog>; a Consumer<Animal> must also work.
- [K079 — Stable key](exercises/K079-stable-key/README.md): Return a set of case-insensitive ASCII identifiers, normalized using lowercase.
- [K080 — Java boundary](exercises/K080-java-boundary/README.md): Accept a java.util.Optional<String>, trim it, and return null for missing or blank values.

## Level gate
Run `./gradlew :level-08-design:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
