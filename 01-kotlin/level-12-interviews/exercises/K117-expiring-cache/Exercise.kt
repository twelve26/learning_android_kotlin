package k117
data class Entry(val value: String, val expiresAt: Long)

fun active(entries: Map<String, Entry>, now: Long): Map<String, String> =
    TODO("K117: Expiring cache")
