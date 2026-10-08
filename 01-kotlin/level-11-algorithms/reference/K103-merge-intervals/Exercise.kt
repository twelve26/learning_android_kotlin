package k103

fun mergeIntervals(values: List<Pair<Int, Int>>): List<Pair<Int, Int>> = run {
    require(values.all { it.first <= it.second })
    val out = mutableListOf<Pair<Int, Int>>()
    for (v in values.sortedBy { it.first }) {
        val last = out.lastOrNull()
        if (last != null && v.first <= last.second)
            out[out.lastIndex] = last.first to maxOf(last.second, v.second)
        else out.add(v)
    }
    out
}
