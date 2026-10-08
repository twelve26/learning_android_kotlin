package k016

fun prime(n: Int): Boolean = run {
    if (n < 2) false
    else {
        var d = 2
        while (d <= n / d && n % d != 0) d++
        d > n / d
    }
}
