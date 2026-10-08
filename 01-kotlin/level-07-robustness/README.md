# Level 07 — Parsing, errors and boundaries

Parsing converts untrusted representations into domain values. Validate before indexing. Exceptions, nullable returns and Result communicate different contracts. Handle expected failures narrowly; cancellation is not a business error.

Prerequisite: Kotlin level 06.

## Exercise order
- [K061 — Strict coordinates](exercises/K061-strict-coordinates/README.md): Parse exactly two comma-separated Ints, trimming each; otherwise null.
- [K062 — Configuration lines](exercises/K062-configuration-lines/README.md): Parse key=value lines; ignore blanks and lines starting # after trimming. Last duplicate wins. Reject missing = or empty key.
- [K063 — Result boundary](exercises/K063-result-boundary/README.md): Return Result<Int> from parsing; invalid input is a failure.
- [K064 — CSV pair](exercises/K064-csv-pair/README.md): Parse a two-field unquoted CSV row; reject quotes or a field count other than two. Preserve empty fields.
- [K065 — Version ordering](exercises/K065-version-ordering/README.md): Compare dotted nonnegative integer versions; missing trailing components are zero. Reject malformed components. Return -1,0,1.
- [K066 — Balanced delimiters](exercises/K066-balanced-delimiters/README.md): Accept only correctly nested (), [] and {}; ignore other characters.
- [K067 — Redacted logs](exercises/K067-redacted-logs/README.md): Replace values for case-insensitive password or token keys with [REDACTED]. Preserve keys and other values.
- [K068 — Bounded integer](exercises/K068-bounded-integer/README.md): Parse a Long then convert to Int only when representable. Return null otherwise.
- [K069 — Transactional batch](exercises/K069-transactional-batch/README.md): Apply withdrawals to balance; reject negative withdrawals or overdraft with null, exposing no partial result.
- [K070 — Resource lifetime](exercises/K070-resource-lifetime/README.md): Call useBlock with a Closeable resource and close it even if the block fails.

## Level gate
Run `./gradlew :level-07-robustness:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
