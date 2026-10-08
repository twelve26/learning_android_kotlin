package k114
data class Event(val id: String, val delta: Int)

fun ledger(events: List<Event>): Long = TODO("K114: Idempotent events")
