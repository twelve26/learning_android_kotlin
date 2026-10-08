package k028

fun factorial(n: Int): Long = run {
    require(n in 0..20)
    (1..n).fold(1L) { a, v -> a * v }
}
