package k063

fun parse(text: String): Result<Int> = runCatching { text.toInt() }
