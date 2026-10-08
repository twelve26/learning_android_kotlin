package k111

fun misses(requests: List<Int>, capacity: Int): Int = run {
    require(capacity >= 0)
    val cache = linkedSetOf<Int>()
    var misses = 0
    for (k in requests) {
        if (!cache.remove(k)) misses++
        if (capacity > 0) {
            cache.add(k)
            if (cache.size > capacity) cache.remove(cache.first())
        }
    }
    misses
}
