package k112

fun admit(times: List<Long>, limit: Int, windowMs: Long): List<Boolean> = run {
    require(limit >= 0 && windowMs > 0)
    var bucket = -1L
    var count = 0
    times.map { t ->
        require(t >= 0)
        val b = t / windowMs
        if (b != bucket) {
            bucket = b
            count = 0
        }
        if (count < limit) {
            count++
            true
        } else false
    }
}
