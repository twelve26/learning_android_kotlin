package k113
data class Document(val text: String, val version: Long)

fun save(current: Document, expectedVersion: Long, text: String): Document? =
    if (current.version == expectedVersion) Document(text, Math.addExact(current.version, 1L))
    else null
