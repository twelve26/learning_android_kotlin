package k014

fun checksum(n: Int): Long = run {
    var sum = 0L
    for (i in 1..n) sum += i
    sum
}
