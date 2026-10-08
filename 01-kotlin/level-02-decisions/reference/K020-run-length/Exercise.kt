package k020

fun longest(values: List<Boolean>): Int = run {
    var best = 0
    var current = 0
    for (v in values) {
        current = if (v) current + 1 else 0
        best = maxOf(best, current)
    }
    best
}
