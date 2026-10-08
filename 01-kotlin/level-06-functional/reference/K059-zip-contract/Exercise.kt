package k059

fun <A, B, C> zipExact(a: List<A>, b: List<B>, combine: (A, B) -> C): List<C> = run {
    require(a.size == b.size)
    a.zip(b, combine)
}
