package k044
fun interface Pricing {
    fun quote(weight: Int): Long
}

fun shipping(weights: List<Int>, pricing: Pricing): Long = weights.sumOf { pricing.quote(it) }
