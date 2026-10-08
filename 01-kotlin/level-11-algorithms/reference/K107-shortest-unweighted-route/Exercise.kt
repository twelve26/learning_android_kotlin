package k107

fun hops(graph: Map<String, List<String>>, start: String, goal: String): Int? = run {
    val q = ArrayDeque<Pair<String, Int>>()
    val seen = mutableSetOf(start)
    q.add(start to 0)
    var result: Int? = null
    while (q.isNotEmpty()) {
        val (v, d) = q.removeFirst()
        if (v == goal) {
            result = d
            break
        }
        for (n in graph[v].orEmpty()) if (seen.add(n)) q.add(n to d + 1)
    }
    result
}
