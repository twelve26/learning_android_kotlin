package k051

fun String.slug(): String = lowercase().replace(Regex("[^a-z0-9]+"), "-").trim('-')
