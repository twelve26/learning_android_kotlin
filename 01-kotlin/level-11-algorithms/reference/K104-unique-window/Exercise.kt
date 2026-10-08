package k104

fun window(text: String): Int = run {
    val last = mutableMapOf<Char, Int>()
    var start = 0
    var best = 0
    for ((i, c) in text.withIndex()) {
        start = maxOf(start, (last[c] ?: -1) + 1)
        last[c] = i
        best = maxOf(best, i - start + 1)
    }
    best
}
