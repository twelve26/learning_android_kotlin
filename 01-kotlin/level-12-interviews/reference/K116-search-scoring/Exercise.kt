package k116

fun search(docs: Map<Int, String>, query: String): List<Int> = run {
    fun words(s: String) = s.lowercase().split(Regex("\\s+")).filter { it.isNotBlank() }.toSet()
    val q = words(query)
    docs
        .map { (id, text) -> id to words(text).intersect(q).size }
        .filter { it.second > 0 }
        .sortedWith(compareByDescending<Pair<Int, Int>> { it.second }.thenBy { it.first })
        .map { it.first }
}
