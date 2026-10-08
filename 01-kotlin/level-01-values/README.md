# Level 01 — Values, types and expressions

A value has a type. `val` prevents reassignment; `var` permits it. Arithmetic on Int truncates division and can overflow. Strings support templates. Write small expressions and observe exact outputs.

Prerequisite: environment setup and no prior Kotlin knowledge.

## Exercise order
- [K001 — Parcel labels](exercises/K001-parcel-labels/README.md): Return "Parcel #<id>: <name>" with name unchanged.
- [K002 — Cinema receipt](exercises/K002-cinema-receipt/README.md): Tickets cost 1250 cents each. Return total as Long; count is nonnegative.
- [K003 — Team split](exercises/K003-team-split/README.md): Return full teams of size teamSize; people >= 0 and teamSize > 0.
- [K004 — Remaining seats](exercises/K004-remaining-seats/README.md): Return people left after forming full teams. Valid inputs match the previous exercise.
- [K005 — Temperature board](exercises/K005-temperature-board/README.md): Convert Celsius to Fahrenheit with fractional precision.
- [K006 — Clock display](exercises/K006-clock-display/README.md): For seconds >= 0, format whole minutes and remaining seconds as "m:ss".
- [K007 — Price swap](exercises/K007-price-swap/README.md): Return prices in reverse order without changing either value.
- [K008 — Battery badge](exercises/K008-battery-badge/README.md): Return true when charge is at least 20 and power saving is off.
- [K009 — Distance counter](exercises/K009-distance-counter/README.md): Return absolute distance between two Int positions as Long.
- [K010 — Initials](exercises/K010-initials/README.md): Return the first character of each nonempty name joined without punctuation.

## Level gate
Run `./gradlew :level-01-values:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
