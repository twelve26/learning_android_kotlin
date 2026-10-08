package k113
data class Document(val text: String, val version: Long)

fun save(current: Document, expectedVersion: Long, text: String): Document? =
    TODO("K113: Optimistic conflict")
