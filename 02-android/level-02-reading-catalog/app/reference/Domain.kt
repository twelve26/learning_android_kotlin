package lab.android
fun matching(query: String): List<String> =
    listOf("Kotlin in Action", "Android Internals", "Compose Patterns").filter {
        it.contains(query.trim(), ignoreCase = true)
    }
