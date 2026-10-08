package k033

fun top(values: List<Int>, k: Int): List<Int> = values.sortedDescending().take(k)
