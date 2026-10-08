package k101

fun twoSum(values: List<Int>, target: Int): Pair<Int, Int>? = run {
    val seen = mutableMapOf<Long, Int>()
    var answer: Pair<Int, Int>? = null
    for ((j, v) in values.withIndex()) {
        val i = seen[target.toLong() - v]
        if (i != null) {
            answer = i to j
            break
        }
        seen.putIfAbsent(v.toLong(), j)
    }
    answer
}
