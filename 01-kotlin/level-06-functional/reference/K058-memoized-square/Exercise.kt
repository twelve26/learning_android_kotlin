package k058

fun memoize(compute: (Int) -> Int): (Int) -> Int = run {
    val cache = mutableMapOf<Int, Int>();
    { key: Int -> cache.getOrPut(key) { compute(key) } }
}
