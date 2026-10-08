package k109

fun coins(denominations: List<Int>, amount: Int): Int? = run {
    require(amount >= 0 && denominations.all { it > 0 })
    val dp = IntArray(amount + 1) { amount + 1 }
    dp[0] = 0
    for (a in 1..amount) for (c in denominations) if (c <= a) dp[a] = minOf(dp[a], dp[a - c] + 1)
    dp[amount].takeIf { it <= amount }
}
