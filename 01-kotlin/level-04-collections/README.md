# Level 04 — Collections and transformations

Lists preserve order and duplicates, sets express uniqueness, and maps associate keys with values. `map` transforms, `filter` selects, `fold` accumulates. Empty collections are valid inputs. Read-only interfaces do not imply deep immutability.

Prerequisite: Kotlin level 03.

## Exercise order
- [K031 — Unique attendees](exercises/K031-unique-attendees/README.md): Trim names, drop blanks, remove duplicates, preserving first occurrence and case.
- [K032 — Word census](exercises/K032-word-census/README.md): Count lowercase whitespace-separated words; blank input returns empty map.
- [K033 — Top scores](exercises/K033-top-scores/README.md): Return up to k largest values descending, retaining duplicates; k >= 0.
- [K034 — Inventory merge](exercises/K034-inventory-merge/README.md): Sum quantities for matching keys without mutating either input.
- [K035 — Page windows](exercises/K035-page-windows/README.md): Partition items into consecutive pages of size > 0. Keep the last short page.
- [K036 — Adjacent changes](exercises/K036-adjacent-changes/README.md): Return each measurement minus its immediate predecessor, as Long.
- [K037 — Tag index](exercises/K037-tag-index/README.md): Invert document-to-tags into tag-to-document-list in input iteration order; duplicate tags count once per document.
- [K038 — Running balance](exercises/K038-running-balance/README.md): Return balance after each delta, starting at zero; use Long.
- [K039 — Partition queue](exercises/K039-partition-queue/README.md): Return urgent values >= threshold first and the rest second, each preserving order.
- [K040 — Catalog join](exercises/K040-catalog-join/README.md): Join IDs with available names; omit missing IDs and retain request order and duplicates.

## Level gate
Run `./gradlew :level-04-collections:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
