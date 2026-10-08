# Level 05 — Modeling and state

Data classes represent values. Sealed types represent a closed set of alternatives. Interfaces describe capabilities. Keep invalid states out of constructors, separate identity from display text, and prefer explicit state transitions.

Prerequisite: Kotlin level 04.

## Exercise order
- [K041 — Immutable promotion](exercises/K041-immutable-promotion/README.md): Return a copy of User with premium=true; preserve original.
- [K042 — Money boundary](exercises/K042-money-boundary/README.md): Create Money only for nonnegative cents and an uppercase three-letter ASCII currency.
- [K043 — Loading renderer](exercises/K043-loading-renderer/README.md): Render Idle=Ready, Loading=Loading, Data=value, Failed=Error: reason. Use exhaustive when.
- [K044 — Shipping strategies](exercises/K044-shipping-strategies/README.md): Sum quoted shipping prices using a supplied Pricing interface.
- [K045 — Task transition](exercises/K045-task-transition/README.md): A task can move Todo->Doing->Done. Any other transition returns the original state.
- [K046 — Identity dedupe](exercises/K046-identity-dedupe/README.md): Keep the last Contact for each ID, ordering IDs by first appearance.
- [K047 — Rectangle contracts](exercises/K047-rectangle-contracts/README.md): Return rectangle area as Long, rejecting negative dimensions.
- [K048 — Command history](exercises/K048-command-history/README.md): Apply Add(delta) and Reset commands to a Long counter starting at zero.
- [K049 — Stable ranking](exercises/K049-stable-ranking/README.md): Sort Players by descending score then ascending name.
- [K050 — Nested copy trap](exercises/K050-nested-copy-trap/README.md): Return a new Board with an added card without mutating the original mutable list.

## Level gate
Run `./gradlew :level-05-modeling:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
