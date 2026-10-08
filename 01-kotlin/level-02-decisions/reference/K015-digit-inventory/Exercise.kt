package k015

fun digits(n: Int): Int = run {
    var x = kotlin.math.abs(n.toLong())
    var count = 1
    while (x >= 10) {
        x /= 10
        count++
    }
    count
}
