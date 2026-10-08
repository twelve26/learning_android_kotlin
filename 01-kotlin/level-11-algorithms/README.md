# Level 11 — Algorithms and data structures

Measure cost against input size. A hash map trades space for lookup speed. Two pointers and sliding windows reuse work. State invariants before coding. Use Long for accumulated Int values and test duplicates, emptiness and extremes.

Prerequisite: Kotlin level 10.

## Exercise order
- [K101 — Two sum](exercises/K101-two-sum/README.md): Return indices i<j whose values sum to target, choosing earliest j then earliest i; null if absent. Avoid quadratic search.
- [K102 — Binary lookup](exercises/K102-binary-lookup/README.md): Find any matching index in a sorted ascending list or -1. Use O(log n) time.
- [K103 — Merge intervals](exercises/K103-merge-intervals/README.md): Merge overlapping or touching inclusive intervals; reject start > end. Return ascending order.
- [K104 — Unique window](exercises/K104-unique-window/README.md): Return longest substring length without repeating UTF-16 Char values.
- [K105 — Rotate queue](exercises/K105-rotate-queue/README.md): Rotate right by nonnegative k, preserving duplicates.
- [K106 — Anagram groups](exercises/K106-anagram-groups/README.md): Group strings by their sorted characters. Preserve group first-seen order and member order.
- [K107 — Shortest unweighted route](exercises/K107-shortest-unweighted-route/README.md): Return fewest edges from start to goal in a directed graph, or null.
- [K108 — Maximum subarray](exercises/K108-maximum-subarray/README.md): Return maximum nonempty contiguous sum as Long; null for empty input.
- [K109 — Coin planner](exercises/K109-coin-planner/README.md): Return minimum number of positive denomination coins needed for amount >=0, or null when impossible.
- [K110 — Dependency order](exercises/K110-dependency-order/README.md): Return a topological order for graph keys and neighbors, or null for a cycle. Edges go prerequisite -> dependent.

## Level gate
Run `./gradlew :level-11-algorithms:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
