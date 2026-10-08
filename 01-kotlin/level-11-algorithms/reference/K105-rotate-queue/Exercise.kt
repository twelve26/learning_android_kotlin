package k105

fun rotate(values: List<Int>, k: Int): List<Int> =
    if (values.isEmpty()) emptyList()
    else {
        val n = k % values.size
        values.takeLast(n) + values.dropLast(n)
    }
