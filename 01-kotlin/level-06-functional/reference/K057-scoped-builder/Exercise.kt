package k057

fun message(block: StringBuilder.() -> Unit): String = StringBuilder().apply(block).toString()
