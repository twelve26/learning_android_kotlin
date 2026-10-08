package k102

fun find(values: List<Int>, target: Int): Int = run {
    var lo = 0
    var hi = values.lastIndex
    var found = -1
    while (lo <= hi) {
        val m = lo + (hi - lo) / 2
        when {
            values[m] < target -> lo = m + 1
            values[m] > target -> hi = m - 1
            else -> {
                found = m
                break
            }
        }
    }
    found
}
