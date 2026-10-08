# Level 02 — Decisions and repetition

An `if` or `when` can produce a value. Ranges describe sequences; loops repeat work. Keep an invariant: a statement that remains true after each iteration. Validate boundaries before the happy path.

Prerequisite: Kotlin level 01.

## Exercise order
- [K011 — Gatekeeper](exercises/K011-gatekeeper/README.md): Ages below 0 are invalid; below 12 child; below 18 teen; otherwise adult.
- [K012 — Leap calendar](exercises/K012-leap-calendar/README.md): Return whether a positive Gregorian year is a leap year.
- [K013 — Fizz labels](exercises/K013-fizz-labels/README.md): For n >= 1 return Fizz for multiples of 3, Buzz of 5, FizzBuzz of both, otherwise n as text.
- [K014 — Step checksum](exercises/K014-step-checksum/README.md): Sum integers from 1 through n for 0 <= n <= 1000000. Use a loop first.
- [K015 — Digit inventory](exercises/K015-digit-inventory/README.md): Count decimal digits of any Int, ignoring its sign; zero has one digit.
- [K016 — Prime lock](exercises/K016-prime-lock/README.md): Return true exactly when n is prime.
- [K017 — Stair builder](exercises/K017-stair-builder/README.md): For n >= 0 return n lines of one through n stars, no trailing newline.
- [K018 — Retry schedule](exercises/K018-retry-schedule/README.md): Return attempts delays [1,2,4,...], where attempts is in 0..30.
- [K019 — First alarm](exercises/K019-first-alarm/README.md): Return index of first value above threshold, or -1.
- [K020 — Run length](exercises/K020-run-length/README.md): Return longest consecutive run of true values.

## Level gate
Run `./gradlew :level-02-decisions:test` from `01-kotlin`. All exercises start unfinished. Use `-Preference` only to check reference solutions. Explain two solutions and revisit one without hints before moving on.
