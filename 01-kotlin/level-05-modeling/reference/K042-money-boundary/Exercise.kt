package k042
data class Money(val cents: Long, val currency: String)

fun money(cents: Long, currency: String): Money = run {
    require(cents >= 0 && currency.matches(Regex("[A-Z]{3}")))
    Money(cents, currency)
}
