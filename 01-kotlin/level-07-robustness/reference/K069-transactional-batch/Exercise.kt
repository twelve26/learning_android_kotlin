package k069

fun withdraw(balance: Long, amounts: List<Long>): Long? = run {
    require(balance >= 0)
    var remaining = balance
    var valid = true
    for (a in amounts) {
        if (a < 0 || a > remaining) {
            valid = false
            break
        }
        remaining -= a
    }
    if (valid) remaining else null
}
