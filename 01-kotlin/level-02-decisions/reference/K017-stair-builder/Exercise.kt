package k017

fun stairs(n: Int): String = (1..n).joinToString("\n") { "*".repeat(it) }
