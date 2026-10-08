# Complete learning guide

## Orientation
Start with [SETUP](docs/SETUP.md) and [PRACTICE](docs/PRACTICE.md). Each linked unit contains its mission, files, execution instructions, hints and completion criteria. No prior Kotlin, Android or iOS knowledge is assumed. Swift host files are scaffolded; inspect their lifecycle and integration points as the KMP route progresses.

## Recommended cross-track route
1. Kotlin levels 01–05: language foundations and modeling.
2. Android levels 01–03 alongside Kotlin levels 06–08.
3. Kotlin levels 09–10 before Android network/background work.
4. Android levels 04–06, then KMP levels 01–03.
5. Android levels 07–09 and KMP levels 04–05.
6. Kotlin levels 11–12 for algorithms and application interview problems.
7. Android level 10 and KMP level 06 as integration challenges.

Within each level, follow numeric IDs. Alternatively complete each track sequentially, respecting prerequisites. After every level, pass its review gate; do not advance solely because a checkbox is checked. A revisit after a break is part of the route.

The local [progress dashboard](progress.html) supports track/status filters, search, notes, and JSON backup. Checkboxes are self-assessment; Gradle tests remain the executable feedback.

## Kotlin route

### Level 01 — Values, types and expressions

- [K001 — Parcel labels](01-kotlin/level-01-values/exercises/K001-parcel-labels/README.md) — Return "Parcel #<id>: <name>" with name unchanged.
- [K002 — Cinema receipt](01-kotlin/level-01-values/exercises/K002-cinema-receipt/README.md) — Tickets cost 1250 cents each. Return total as Long; count is nonnegative.
- [K003 — Team split](01-kotlin/level-01-values/exercises/K003-team-split/README.md) — Return full teams of size teamSize; people >= 0 and teamSize > 0.
- [K004 — Remaining seats](01-kotlin/level-01-values/exercises/K004-remaining-seats/README.md) — Return people left after forming full teams. Valid inputs match the previous exercise.
- [K005 — Temperature board](01-kotlin/level-01-values/exercises/K005-temperature-board/README.md) — Convert Celsius to Fahrenheit with fractional precision.
- [K006 — Clock display](01-kotlin/level-01-values/exercises/K006-clock-display/README.md) — For seconds >= 0, format whole minutes and remaining seconds as "m:ss".
- [K007 — Price swap](01-kotlin/level-01-values/exercises/K007-price-swap/README.md) — Return prices in reverse order without changing either value.
- [K008 — Battery badge](01-kotlin/level-01-values/exercises/K008-battery-badge/README.md) — Return true when charge is at least 20 and power saving is off.
- [K009 — Distance counter](01-kotlin/level-01-values/exercises/K009-distance-counter/README.md) — Return absolute distance between two Int positions as Long.
- [K010 — Initials](01-kotlin/level-01-values/exercises/K010-initials/README.md) — Return the first character of each nonempty name joined without punctuation.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.
### Level 02 — Decisions and repetition

- [K011 — Gatekeeper](01-kotlin/level-02-decisions/exercises/K011-gatekeeper/README.md) — Ages below 0 are invalid; below 12 child; below 18 teen; otherwise adult.
- [K012 — Leap calendar](01-kotlin/level-02-decisions/exercises/K012-leap-calendar/README.md) — Return whether a positive Gregorian year is a leap year.
- [K013 — Fizz labels](01-kotlin/level-02-decisions/exercises/K013-fizz-labels/README.md) — For n >= 1 return Fizz for multiples of 3, Buzz of 5, FizzBuzz of both, otherwise n as text.
- [K014 — Step checksum](01-kotlin/level-02-decisions/exercises/K014-step-checksum/README.md) — Sum integers from 1 through n for 0 <= n <= 1000000. Use a loop first.
- [K015 — Digit inventory](01-kotlin/level-02-decisions/exercises/K015-digit-inventory/README.md) — Count decimal digits of any Int, ignoring its sign; zero has one digit.
- [K016 — Prime lock](01-kotlin/level-02-decisions/exercises/K016-prime-lock/README.md) — Return true exactly when n is prime.
- [K017 — Stair builder](01-kotlin/level-02-decisions/exercises/K017-stair-builder/README.md) — For n >= 0 return n lines of one through n stars, no trailing newline.
- [K018 — Retry schedule](01-kotlin/level-02-decisions/exercises/K018-retry-schedule/README.md) — Return attempts delays [1,2,4,...], where attempts is in 0..30.
- [K019 — First alarm](01-kotlin/level-02-decisions/exercises/K019-first-alarm/README.md) — Return index of first value above threshold, or -1.
- [K020 — Run length](01-kotlin/level-02-decisions/exercises/K020-run-length/README.md) — Return longest consecutive run of true values.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 03 — Functions and null safety

- [K021 — Safe nickname](01-kotlin/level-03-functions/exercises/K021-safe-nickname/README.md) — Trim a nullable name. Use Guest if null or blank.
- [K022 — Safe quotient](01-kotlin/level-03-functions/exercises/K022-safe-quotient/README.md) — Return null for zero denominator; otherwise floating-point quotient.
- [K023 — Port parser](01-kotlin/level-03-functions/exercises/K023-port-parser/README.md) — Parse an integer in 1..65535 or return null; allow surrounding spaces.
- [K024 — Welcome defaults](01-kotlin/level-03-functions/exercises/K024-welcome-defaults/README.md) — Return "Hello, name!" repeated times joined by a space. Defaults: name=Guest, times=1. times >= 0.
- [K025 — Nullable cart](01-kotlin/level-03-functions/exercises/K025-nullable-cart/README.md) — Sum non-null prices as Long; empty or all-null carts cost zero.
- [K026 — Last extension](01-kotlin/level-03-functions/exercises/K026-last-extension/README.md) — Return lowercase extension after the last dot, or null if dot missing, first, or last.
- [K027 — Clamp contract](01-kotlin/level-03-functions/exercises/K027-clamp-contract/README.md) — Clamp x to inclusive min..max; reject min > max with IllegalArgumentException.
- [K028 — Factorial stack](01-kotlin/level-03-functions/exercises/K028-factorial-stack/README.md) — Compute factorial for n in 0..20; reject other values.
- [K029 — Search fallback](01-kotlin/level-03-functions/exercises/K029-search-fallback/README.md) — Return first nonblank trimmed string, or null.
- [K030 — Recursive folders](01-kotlin/level-03-functions/exercises/K030-recursive-folders/README.md) — Sum a tree of nested integer lists represented by Node.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 04 — Collections and transformations

- [K031 — Unique attendees](01-kotlin/level-04-collections/exercises/K031-unique-attendees/README.md) — Trim names, drop blanks, remove duplicates, preserving first occurrence and case.
- [K032 — Word census](01-kotlin/level-04-collections/exercises/K032-word-census/README.md) — Count lowercase whitespace-separated words; blank input returns empty map.
- [K033 — Top scores](01-kotlin/level-04-collections/exercises/K033-top-scores/README.md) — Return up to k largest values descending, retaining duplicates; k >= 0.
- [K034 — Inventory merge](01-kotlin/level-04-collections/exercises/K034-inventory-merge/README.md) — Sum quantities for matching keys without mutating either input.
- [K035 — Page windows](01-kotlin/level-04-collections/exercises/K035-page-windows/README.md) — Partition items into consecutive pages of size > 0. Keep the last short page.
- [K036 — Adjacent changes](01-kotlin/level-04-collections/exercises/K036-adjacent-changes/README.md) — Return each measurement minus its immediate predecessor, as Long.
- [K037 — Tag index](01-kotlin/level-04-collections/exercises/K037-tag-index/README.md) — Invert document-to-tags into tag-to-document-list in input iteration order; duplicate tags count once per document.
- [K038 — Running balance](01-kotlin/level-04-collections/exercises/K038-running-balance/README.md) — Return balance after each delta, starting at zero; use Long.
- [K039 — Partition queue](01-kotlin/level-04-collections/exercises/K039-partition-queue/README.md) — Return urgent values >= threshold first and the rest second, each preserving order.
- [K040 — Catalog join](01-kotlin/level-04-collections/exercises/K040-catalog-join/README.md) — Join IDs with available names; omit missing IDs and retain request order and duplicates.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 05 — Modeling and state

- [K041 — Immutable promotion](01-kotlin/level-05-modeling/exercises/K041-immutable-promotion/README.md) — Return a copy of User with premium=true; preserve original.
- [K042 — Money boundary](01-kotlin/level-05-modeling/exercises/K042-money-boundary/README.md) — Create Money only for nonnegative cents and an uppercase three-letter ASCII currency.
- [K043 — Loading renderer](01-kotlin/level-05-modeling/exercises/K043-loading-renderer/README.md) — Render Idle=Ready, Loading=Loading, Data=value, Failed=Error: reason. Use exhaustive when.
- [K044 — Shipping strategies](01-kotlin/level-05-modeling/exercises/K044-shipping-strategies/README.md) — Sum quoted shipping prices using a supplied Pricing interface.
- [K045 — Task transition](01-kotlin/level-05-modeling/exercises/K045-task-transition/README.md) — A task can move Todo->Doing->Done. Any other transition returns the original state.
- [K046 — Identity dedupe](01-kotlin/level-05-modeling/exercises/K046-identity-dedupe/README.md) — Keep the last Contact for each ID, ordering IDs by first appearance.
- [K047 — Rectangle contracts](01-kotlin/level-05-modeling/exercises/K047-rectangle-contracts/README.md) — Return rectangle area as Long, rejecting negative dimensions.
- [K048 — Command history](01-kotlin/level-05-modeling/exercises/K048-command-history/README.md) — Apply Add(delta) and Reset commands to a Long counter starting at zero.
- [K049 — Stable ranking](01-kotlin/level-05-modeling/exercises/K049-stable-ranking/README.md) — Sort Players by descending score then ascending name.
- [K050 — Nested copy trap](01-kotlin/level-05-modeling/exercises/K050-nested-copy-trap/README.md) — Return a new Board with an added card without mutating the original mutable list.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 06 — Higher-order Kotlin

- [K051 — Slug extension](01-kotlin/level-06-functional/exercises/K051-slug-extension/README.md) — Create String.slug(): lowercase ASCII words joined by hyphens; treat non-alphanumeric runs as separators and trim hyphens.
- [K052 — Function pipeline](01-kotlin/level-06-functional/exercises/K052-function-pipeline/README.md) — Apply operations left to right to an initial Int.
- [K053 — Generic middle](01-kotlin/level-06-functional/exercises/K053-generic-middle/README.md) — Return middle element at size/2, or null for empty input.
- [K054 — Predicate audit](01-kotlin/level-06-functional/exercises/K054-predicate-audit/README.md) — Return true only if every rule accepts value; no rules means true.
- [K055 — Lazy first match](01-kotlin/level-06-functional/exercises/K055-lazy-first-match/README.md) — Transform until the first non-null result, without evaluating later elements.
- [K056 — Compose validators](01-kotlin/level-06-functional/exercises/K056-compose-validators/README.md) — Return a function applying f then g.
- [K057 — Scoped builder](01-kotlin/level-06-functional/exercises/K057-scoped-builder/README.md) — Run a receiver lambda on a new StringBuilder and return its text.
- [K058 — Memoized square](01-kotlin/level-06-functional/exercises/K058-memoized-square/README.md) — Return a cached function; compute each distinct input once.
- [K059 — Zip contract](01-kotlin/level-06-functional/exercises/K059-zip-contract/README.md) — Combine equal-sized lists using a function; reject different sizes instead of truncating.
- [K060 — Map values selectively](01-kotlin/level-06-functional/exercises/K060-map-values-selectively/README.md) — Transform only values whose keys satisfy predicate; preserve all keys.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 07 — Parsing, errors and boundaries

- [K061 — Strict coordinates](01-kotlin/level-07-robustness/exercises/K061-strict-coordinates/README.md) — Parse exactly two comma-separated Ints, trimming each; otherwise null.
- [K062 — Configuration lines](01-kotlin/level-07-robustness/exercises/K062-configuration-lines/README.md) — Parse key=value lines; ignore blanks and lines starting # after trimming. Last duplicate wins. Reject missing = or empty key.
- [K063 — Result boundary](01-kotlin/level-07-robustness/exercises/K063-result-boundary/README.md) — Return Result<Int> from parsing; invalid input is a failure.
- [K064 — CSV pair](01-kotlin/level-07-robustness/exercises/K064-csv-pair/README.md) — Parse a two-field unquoted CSV row; reject quotes or a field count other than two. Preserve empty fields.
- [K065 — Version ordering](01-kotlin/level-07-robustness/exercises/K065-version-ordering/README.md) — Compare dotted nonnegative integer versions; missing trailing components are zero. Reject malformed components. Return -1,0,1.
- [K066 — Balanced delimiters](01-kotlin/level-07-robustness/exercises/K066-balanced-delimiters/README.md) — Accept only correctly nested (), [] and {}; ignore other characters.
- [K067 — Redacted logs](01-kotlin/level-07-robustness/exercises/K067-redacted-logs/README.md) — Replace values for case-insensitive password or token keys with [REDACTED]. Preserve keys and other values.
- [K068 — Bounded integer](01-kotlin/level-07-robustness/exercises/K068-bounded-integer/README.md) — Parse a Long then convert to Int only when representable. Return null otherwise.
- [K069 — Transactional batch](01-kotlin/level-07-robustness/exercises/K069-transactional-batch/README.md) — Apply withdrawals to balance; reject negative withdrawals or overdraft with null, exposing no partial result.
- [K070 — Resource lifetime](01-kotlin/level-07-robustness/exercises/K070-resource-lifetime/README.md) — Call useBlock with a Closeable resource and close it even if the block fails.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 08 — APIs, generics and DSLs

- [K071 — Reified filter](01-kotlin/level-08-design/exercises/K071-reified-filter/README.md) — Implement a generic runtime type filter preserving order.
- [K072 — Read-only snapshot](01-kotlin/level-08-design/exercises/K072-read-only-snapshot/README.md) — Return a defensive list copy that is unaffected by later changes to input.
- [K073 — Lazy settings](01-kotlin/level-08-design/exercises/K073-lazy-settings/README.md) — Return a Lazy value that evaluates loader at most once on successful access.
- [K074 — Observable score](01-kotlin/level-08-design/exercises/K074-observable-score/README.md) — Create Score whose value setter reports old and new values through callback.
- [K075 — Route DSL](01-kotlin/level-08-design/exercises/K075-route-dsl/README.md) — Build routes using receiver lambda; reject duplicate paths and non-absolute paths.
- [K076 — Operator vector](01-kotlin/level-08-design/exercises/K076-operator-vector/README.md) — Return a+b using an operator overload on Vector.
- [K077 — Covariant producer](01-kotlin/level-08-design/exercises/K077-covariant-producer/README.md) — Read a Dog producer through an Animal producer parameter.
- [K078 — Contravariant sink](01-kotlin/level-08-design/exercises/K078-contravariant-sink/README.md) — Send every Dog to a Consumer<Dog>; a Consumer<Animal> must also work.
- [K079 — Stable key](01-kotlin/level-08-design/exercises/K079-stable-key/README.md) — Return a set of case-insensitive ASCII identifiers, normalized using lowercase.
- [K080 — Java boundary](01-kotlin/level-08-design/exercises/K080-java-boundary/README.md) — Accept a java.util.Optional<String>, trim it, and return null for missing or blank values.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 09 — Structured concurrency

- [K081 — Suspend greeting](01-kotlin/level-09-coroutines/exercises/K081-suspend-greeting/README.md) — Wait 100 virtual milliseconds then return Hello. Do not block a thread.
- [K082 — Parallel quotes](01-kotlin/level-09-coroutines/exercises/K082-parallel-quotes/README.md) — Call both suspending suppliers concurrently and return sum. Child failure must propagate.
- [K083 — Timeout fallback](01-kotlin/level-09-coroutines/exercises/K083-timeout-fallback/README.md) — Return supplier result within 100 ms, or null on timeout.
- [K084 — Retry IO](01-kotlin/level-09-coroutines/exercises/K084-retry-io/README.md) — Try block up to attempts > 0 times; retry only IOException, propagate final error and cancellation.
- [K085 — Ordered parallel map](01-kotlin/level-09-coroutines/exercises/K085-ordered-parallel-map/README.md) — Run each transform concurrently but retain input order. Intended for small bounded input.
- [K086 — Cancellation cleanup](01-kotlin/level-09-coroutines/exercises/K086-cancellation-cleanup/README.md) — Suspend until cancelled; always call cleanup exactly once.
- [K087 — Mutex ledger](01-kotlin/level-09-coroutines/exercises/K087-mutex-ledger/README.md) — Run n concurrent increments safely and return n; n >= 0.
- [K088 — Supervisor fallback](01-kotlin/level-09-coroutines/exercises/K088-supervisor-fallback/README.md) — Run both suppliers independently; convert IOException to 0 per child and sum. Other exceptions propagate.
- [K089 — Dispatcher injection](01-kotlin/level-09-coroutines/exercises/K089-dispatcher-injection/README.md) — Execute block using the supplied CoroutineDispatcher.
- [K090 — Bounded parallelism](01-kotlin/level-09-coroutines/exercises/K090-bounded-parallelism/README.md) — Map concurrently with at most limit > 0 transforms active. Preserve order.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 10 — Flow and reactive state

- [K091 — Cold sensor](01-kotlin/level-10-flows/exercises/K091-cold-sensor/README.md) — Emit each supplied reading only when collected.
- [K092 — Clean readings](01-kotlin/level-10-flows/exercises/K092-clean-readings/README.md) — Keep nonnegative values, double them, remove adjacent duplicates.
- [K093 — Stream balance](01-kotlin/level-10-flows/exercises/K093-stream-balance/README.md) — Emit initial zero then running Long sum.
- [K094 — First available](01-kotlin/level-10-flows/exercises/K094-first-available/README.md) — Return first non-null value or null when source completes without one.
- [K095 — Recover transport](01-kotlin/level-10-flows/exercises/K095-recover-transport/README.md) — On IOException emit cached; other exceptions must propagate.
- [K096 — Latest search](01-kotlin/level-10-flows/exercises/K096-latest-search/README.md) — For each query run search; cancel obsolete searches.
- [K097 — Debounced typing](01-kotlin/level-10-flows/exercises/K097-debounced-typing/README.md) — Emit typing values only after 100 ms of silence; final pending value is emitted on completion.
- [K098 — Combine form](01-kotlin/level-10-flows/exercises/K098-combine-form/README.md) — Combine latest name and accepted flag into validity: nonblank name and true flag.
- [K099 — State update](01-kotlin/level-10-flows/exercises/K099-state-update/README.md) — Apply a delta atomically to MutableStateFlow<Int>.
- [K100 — Take bounded stream](01-kotlin/level-10-flows/exercises/K100-take-bounded-stream/README.md) — Collect at most n values from an infinite counter; n >= 0.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 11 — Algorithms and data structures

- [K101 — Two sum](01-kotlin/level-11-algorithms/exercises/K101-two-sum/README.md) — Return indices i<j whose values sum to target, choosing earliest j then earliest i; null if absent. Avoid quadratic search.
- [K102 — Binary lookup](01-kotlin/level-11-algorithms/exercises/K102-binary-lookup/README.md) — Find any matching index in a sorted ascending list or -1. Use O(log n) time.
- [K103 — Merge intervals](01-kotlin/level-11-algorithms/exercises/K103-merge-intervals/README.md) — Merge overlapping or touching inclusive intervals; reject start > end. Return ascending order.
- [K104 — Unique window](01-kotlin/level-11-algorithms/exercises/K104-unique-window/README.md) — Return longest substring length without repeating UTF-16 Char values.
- [K105 — Rotate queue](01-kotlin/level-11-algorithms/exercises/K105-rotate-queue/README.md) — Rotate right by nonnegative k, preserving duplicates.
- [K106 — Anagram groups](01-kotlin/level-11-algorithms/exercises/K106-anagram-groups/README.md) — Group strings by their sorted characters. Preserve group first-seen order and member order.
- [K107 — Shortest unweighted route](01-kotlin/level-11-algorithms/exercises/K107-shortest-unweighted-route/README.md) — Return fewest edges from start to goal in a directed graph, or null.
- [K108 — Maximum subarray](01-kotlin/level-11-algorithms/exercises/K108-maximum-subarray/README.md) — Return maximum nonempty contiguous sum as Long; null for empty input.
- [K109 — Coin planner](01-kotlin/level-11-algorithms/exercises/K109-coin-planner/README.md) — Return minimum number of positive denomination coins needed for amount >=0, or null when impossible.
- [K110 — Dependency order](01-kotlin/level-11-algorithms/exercises/K110-dependency-order/README.md) — Return a topological order for graph keys and neighbors, or null for a cycle. Edges go prerequisite -> dependent.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 12 — Interview and application challenges

- [K111 — LRU request simulator](01-kotlin/level-12-interviews/exercises/K111-lru-request-simulator/README.md) — Simulate capacity >=0 cache; return cache misses. Access refreshes recency; evict least recently used.
- [K112 — Fixed-window limiter](01-kotlin/level-12-interviews/exercises/K112-fixed-window-limiter/README.md) — For nondecreasing nonnegative millisecond timestamps, accept at most limit requests per windowMs bucket. limit>=0, windowMs>0.
- [K113 — Optimistic conflict](01-kotlin/level-12-interviews/exercises/K113-optimistic-conflict/README.md) — Apply update only when expectedVersion equals current.version; increment version and return new document, otherwise null.
- [K114 — Idempotent events](01-kotlin/level-12-interviews/exercises/K114-idempotent-events/README.md) — Apply each event ID only once in arrival order and return Long balance. Duplicate IDs keep first event.
- [K115 — Cursor page](01-kotlin/level-12-interviews/exercises/K115-cursor-page/README.md) — For strictly ascending unique IDs, return up to size >=0 IDs greater than cursor; null cursor starts at beginning.
- [K116 — Search scoring](01-kotlin/level-12-interviews/exercises/K116-search-scoring/README.md) — Rank documents by number of query words present, ignoring case. Query words are distinct; omit zero scores. Break ties by ID.
- [K117 — Expiring cache](01-kotlin/level-12-interviews/exercises/K117-expiring-cache/README.md) — Return entries whose expiresAt is strictly greater than now. Preserve key/value pairs.
- [K118 — Undo machine](01-kotlin/level-12-interviews/exercises/K118-undo-machine/README.md) — Interpret +text as push, undo as pop, redo as restore. A new push clears redo. Return final stack. Reject other commands.
- [K119 — Offline reconciliation](01-kotlin/level-12-interviews/exercises/K119-offline-reconciliation/README.md) — Merge local and remote records by ID using highest revision; remote wins ties; sort output by ID. Tombstones remain.
- [K120 — Batch scheduler](01-kotlin/level-12-interviews/exercises/K120-batch-scheduler/README.md) — Greedily partition ordered positive task weights into batches of total <= limit. Reject a task heavier than limit.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

## Android route

### Level 01 — Habit counter

- [A01.1 — Describe the screen](02-android/level-01-habit-counter/stages/01.md) — Create a title, a count and an Add session button. Use Column, spacing and MaterialTheme. Implement nextCount.
- [A01.2 — Events and state hoisting](02-android/level-01-habit-counter/stages/02.md) — Extract a CounterControls composable receiving count and event callbacks. Add Undo without allowing negative counts.
- [A01.3 — Progress and restoration](02-android/level-01-habit-counter/stages/03.md) — Show progress derived from count. Rotate or recreate the Activity and preserve count.
- [A01.4 — Accessible completion](02-android/level-01-habit-counter/stages/04.md) — Add Reset, a polite live region, light/dark previews and a Compose UI test.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 02 — Reading catalog

- [A02.1 — Stable lazy list](02-android/level-02-reading-catalog/stages/01.md) — Render a local catalog with LazyColumn and stable keys. Define a Book model with ID and title in your implementation.
- [A02.2 — Search and empty state](02-android/level-02-reading-catalog/stages/02.md) — Add case-insensitive trimmed search, a clear action and an empty result message.
- [A02.3 — Navigation and back](02-android/level-02-reading-catalog/stages/03.md) — Add a detail destination and explicit back action. Encode route arguments.
- [A02.4 — Saveable detail state](02-android/level-02-reading-catalog/stages/04.md) — Add a saved toggle, restore it on recreation, and test navigation using the emulator.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 03 — Profile form

- [A03.1 — Unidirectional state](02-android/level-03-profile-form/stages/01.md) — Create immutable FormState and ViewModel events; expose StateFlow without a public mutable setter.
- [A03.2 — Keyboard and validation](02-android/level-03-profile-form/stages/02.md) — Add email input and implement the validator. Use email keyboard and single-line inputs.
- [A03.3 — Lifecycle-aware feedback](02-android/level-03-profile-form/stages/03.md) — Collect using collectAsStateWithLifecycle and render validation feedback.
- [A03.4 — Test and explain lifetime](02-android/level-03-profile-form/stages/04.md) — Write model event tests and document rotation versus process death. Add SavedStateHandle for a small draft as an extension.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 04 — Network reader

- [A04.1 — Fixture transport](02-android/level-04-network-reader/stages/01.md) — Load a bundled newline-separated fixture through a suspend repository. Render loading and success.
- [A04.2 — Failure and retry](02-android/level-04-network-reader/stages/02.md) — Add a deterministic failing transport and a retry action. Preserve CancellationException.
- [A04.3 — Empty and cancellation](02-android/level-04-network-reader/stages/03.md) — Distinguish an empty response from a failed request. Cancel superseded work or disable duplicate submission.
- [A04.4 — Actual HTTP boundary](02-android/level-04-network-reader/stages/04.md) — Run tools/fixture_server.py and connect with the Android emulator using 10.0.2.2:8765. Add timeouts and close resources.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 05 — Persistent notes

- [A05.1 — Durable add and read](02-android/level-05-persistent-notes/stages/01.md) — Implement a notes table, validated insert and load on launch. Run storage operations on IO.
- [A05.2 — Delete by identity](02-android/level-05-persistent-notes/stages/02.md) — Delete a single note by stable ID, including when texts are identical.
- [A05.3 — Schema migration](02-android/level-05-persistent-notes/stages/03.md) — Start with schema v1 containing id/text, then migrate to v2 adding pinned. Add a pin action and sorting.
- [A05.4 — Repository and Room transfer](02-android/level-05-persistent-notes/stages/04.md) — Extract NoteRepository; write insert/delete/migration device tests. Optional implementation transfer: Room Entity, DAO, Database and Migration(1,2).

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 06 — Repository and dependency injection

- [A06.1 — Repository contract](02-android/level-06-repository-lab/stages/01.md) — Define stock repository and inject an in-memory implementation into a ViewModel factory.
- [A06.2 — Domain use case](02-android/level-06-repository-lab/stages/02.md) — Implement reservation policy and a use case; prevent zero, negative and excessive quantities.
- [A06.3 — Fakes and state design](02-android/level-06-repository-lab/stages/03.md) — Replace display-string state with a sealed UI state in your solution. Add a failing fake and loading state.
- [A06.4 — Concurrency design review](02-android/level-06-repository-lab/stages/04.md) — Write a test for simultaneous reservations; protect shared stock with Mutex or an atomic database transaction.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 07 — Background work

- [A07.1 — Unique persistent job](02-android/level-07-background-work/stages/01.md) — Implement CoroutineWorker to write a local export and enqueue with unique work KEEP.
- [A07.2 — Observe progress](02-android/level-07-background-work/stages/02.md) — Publish progress with setProgress and collect WorkInfo as UI state.
- [A07.3 — Cancellation and retry policy](02-android/level-07-background-work/stages/03.md) — Add cancellation. Extend the worker with an injected failing writer and bounded retry policy.
- [A07.4 — Background verification](02-android/level-07-background-work/stages/04.md) — Background the app during export and inspect output. Add a notification only as an optional extension with runtime permission handling.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 08 — Adaptive accessible dashboard

- [A08.1 — Compact dashboard](02-android/level-08-adaptive-accessibility/stages/01.md) — Build a scrollable overview with meaningful typography and spacing.
- [A08.2 — Expanded window](02-android/level-08-adaptive-accessibility/stages/02.md) — Switch to navigation plus content at 600dp using actual constraints.
- [A08.3 — Semantics audit](02-android/level-08-adaptive-accessibility/stages/03.md) — Describe non-textual progress and audit traversal with TalkBack.
- [A08.4 — Large text and localization](02-android/level-08-adaptive-accessibility/stages/04.md) — Add large-font and wide previews; extract visible strings to resources in your implementation.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 09 — Isolated View interoperability

- [A09.1 — Host a View](02-android/level-09-view-interop/stages/01.md) — Use AndroidView to host a platform ProgressBar.
- [A09.2 — State synchronization](02-android/level-09-view-interop/stages/02.md) — Drive View progress through update from a Compose Slider.
- [A09.3 — Accessibility and lifetime](02-android/level-09-view-interop/stages/03.md) — Provide meaningful semantics and examine cleanup for Views owning listeners or resources.
- [A09.4 — Replace the boundary](02-android/level-09-view-interop/stages/04.md) — Add a Compose progress indicator using the same state, compare behavior, then remove the View in your own branch.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 10 — Offline task board

- [A10.1 — Local source of truth](02-android/level-10-offline-capstone/stages/01.md) — Build durable local create/edit/read behavior. Start with one task; introduce a repository and stable IDs.
- [A10.2 — Deletion as data](02-android/level-10-offline-capstone/stages/02.md) — Store a revisioned tombstone instead of simply forgetting a deleted record.
- [A10.3 — Conflict and sync](02-android/level-10-offline-capstone/stages/03.md) — Implement deterministic revision merge and test tie rules. Add an outbox with idempotency IDs as your main integration challenge.
- [A10.4 — Production review](02-android/level-10-offline-capstone/stages/04.md) — Split domain/data/UI modules; add WorkManager outbox drain, fake transport, integration tests, startup measurement and a release build.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

## KMP route

### Level 01 — Shared pricing

- [M01.1 — Trace source sets](03-kmp/level-01-shared-pricing/stages/01.md) — Locate commonMain, androidMain and iosMain. Draw which targets compile each file.
- [M01.2 — Shared arithmetic](03-kmp/level-01-shared-pricing/stages/02.md) — Implement totalCents and domain validation using integer cents.
- [M01.3 — Common tests](03-kmp/level-01-shared-pricing/stages/03.md) — Add empty-cart, invalid-input and rounding tests to commonTest.
- [M01.4 — Native UI integration](03-kmp/level-01-shared-pricing/stages/04.md) — Call CourseFacade from Android Compose and SwiftUI and render results.
- [M01.5 — Contract evolution](03-kmp/level-01-shared-pricing/stages/05.md) — Add currency as a domain value and reject mixed currencies; preserve the original tests.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 02 — Shared habit reducer

- [M02.1 — Model valid state](03-kmp/level-02-shared-habits/stages/01.md) — Define immutable habit state and closed events.
- [M02.2 — Reducer transitions](03-kmp/level-02-shared-habits/stages/02.md) — Implement complete, undo and reset without mutating input.
- [M02.3 — Replay and invariants](03-kmp/level-02-shared-habits/stages/03.md) — Write event replay and property-style tests over deterministic event sequences.
- [M02.4 — Host ownership](03-kmp/level-02-shared-habits/stages/04.md) — Make each host own the facade lifetime and render updates.
- [M02.5 — Interview extension](03-kmp/level-02-shared-habits/stages/05.md) — Add multiple habits and stable IDs, then discuss concurrent updates and persistence.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 03 — Shared network repository

- [M03.1 — Serialization boundary](03-kmp/level-03-shared-network/stages/01.md) — Define a serializable DTO and map it into a domain book.
- [M03.2 — Inject HTTP client](03-kmp/level-03-shared-network/stages/02.md) — Implement BookRepository with a constructor-injected Ktor HttpClient and endpoint.
- [M03.3 — Failure contracts](03-kmp/level-03-shared-network/stages/03.md) — Distinguish transport, HTTP status and malformed payload failures.
- [M03.4 — Platform engines](03-kmp/level-03-shared-network/stages/04.md) — Wire OkHttp on Android and Darwin on iOS; close client when its owner ends.
- [M03.5 — Offline extension](03-kmp/level-03-shared-network/stages/05.md) — Add an injected cache, stale-data indicator and retry policy with deterministic fake time.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 04 — Platform settings boundary

- [M04.1 — Platform identity](03-kmp/level-04-platform-settings/stages/01.md) — Implement expect platformName with actual values for Android and iOS.
- [M04.2 — Storage interface](03-kmp/level-04-platform-settings/stages/02.md) — Define StringStore and inject it into shared logic. Write a memory fake.
- [M04.3 — Android implementation](03-kmp/level-04-platform-settings/stages/03.md) — Back the store with SharedPreferences and application context.
- [M04.4 — iOS implementation](03-kmp/level-04-platform-settings/stages/04.md) — Back the same contract with NSUserDefaults.
- [M04.5 — Boundary tests](03-kmp/level-04-platform-settings/stages/05.md) — Test missing keys, overwrite, invalid stored numbers and platform parity.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 05 — Shared streams and lifecycle

- [M05.1 — Shared state producer](03-kmp/level-05-shared-streams/stages/01.md) — Implement Counter with read-only StateFlow and atomic updates.
- [M05.2 — Android observation](03-kmp/level-05-shared-streams/stages/02.md) — Collect state with lifecycle awareness in Android UI.
- [M05.3 — Swift observation bridge](03-kmp/level-05-shared-streams/stages/03.md) — Use observe(callback) to update SwiftUI State and keep the returned cancellation handle.
- [M05.4 — Cancellation ownership](03-kmp/level-05-shared-streams/stages/04.md) — Cancel observation on disappearance and close owned scopes when discarded.
- [M05.5 — Conflation and errors](03-kmp/level-05-shared-streams/stages/05.md) — Document StateFlow conflation, add explicit error state and test rapid updates.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.

### Level 06 — Shared Compose interface

- [M06.1 — Common composable](03-kmp/level-06-compose-multiplatform/stages/01.md) — Build a common reading checklist using Compose runtime, layout and Material components.
- [M06.2 — State and stable identity](03-kmp/level-06-compose-multiplatform/stages/02.md) — Use stable book IDs and an immutable selected set.
- [M06.3 — iOS host controller](03-kmp/level-06-compose-multiplatform/stages/03.md) — Expose ComposeUIViewController from iosMain and wrap it in UIViewControllerRepresentable.
- [M06.4 — Adaptive and accessible UI](03-kmp/level-06-compose-multiplatform/stages/04.md) — Test large text, dark mode and narrow/wide windows on both platforms.
- [M06.5 — Final integration challenge](03-kmp/level-06-compose-multiplatform/stages/05.md) — Combine shared repository, platform storage, stream ownership and native integration into a small offline reading app.

**Gate:** demonstrate the listed contracts, add boundary/failure evidence, explain the new concept and record one observation before proceeding.
