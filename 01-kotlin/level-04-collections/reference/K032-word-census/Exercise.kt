package k032

fun census(text: String): Map<String, Int> =
    text.lowercase().split(Regex("\\s+")).filter(String::isNotBlank).groupingBy { it }.eachCount()
