package k114
data class Event(val id: String, val delta: Int)

fun ledger(events: List<Event>): Long = events.distinctBy { it.id }.sumOf { it.delta.toLong() }
