package k119
data class Record(val id: Int, val revision: Long, val deleted: Boolean)

fun reconcile(local: List<Record>, remote: List<Record>): List<Record> =
    (local + remote)
        .groupBy { it.id }
        .values
        .map { group ->
            group.fold(group.first()) { a, b -> if (b.revision >= a.revision) b else a }
        }
        .sortedBy { it.id }
