package k025

fun cart(prices: List<Int?>): Long = prices.filterNotNull().sumOf { it.toLong() }
