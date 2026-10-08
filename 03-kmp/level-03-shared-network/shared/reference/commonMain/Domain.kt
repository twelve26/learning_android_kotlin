package lab.shared
@kotlinx.serialization.Serializable data class Book(val id: Int, val title: String)

fun parseBooks(text: String): List<Book> =
    kotlinx.serialization.json.Json.decodeFromString<List<Book>>(text)
