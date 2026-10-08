package lab.shared

fun totalCents(prices: List<Int>, discountPercent: Int): Long = run {
    require(prices.all { it >= 0 } && discountPercent in 0..100)
    prices.sumOf { it.toLong() } * (100 - discountPercent) / 100
}
