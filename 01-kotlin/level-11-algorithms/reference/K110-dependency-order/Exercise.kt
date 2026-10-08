package k110

fun order(graph: Map<String, List<String>>): List<String>? = run {
    val nodes = (graph.keys + graph.values.flatten()).toSet()
    val degree = nodes.associateWith { 0 }.toMutableMap()
    for (v in graph.values) for (n in v) degree[n] = degree.getValue(n) + 1
    val q = ArrayDeque(nodes.filter { degree[it] == 0 })
    val out = mutableListOf<String>()
    while (q.isNotEmpty()) {
        val v = q.removeFirst()
        out.add(v)
        for (n in graph[v].orEmpty()) {
            degree[n] = degree.getValue(n) - 1
            if (degree[n] == 0) q.add(n)
        }
    }
    out.takeIf { it.size == nodes.size }
}
