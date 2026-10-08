package k119
data class Record(val id: Int, val revision: Long, val deleted: Boolean)

fun reconcile(local: List<Record>, remote: List<Record>): List<Record> =
    TODO("K119: Offline reconciliation")
