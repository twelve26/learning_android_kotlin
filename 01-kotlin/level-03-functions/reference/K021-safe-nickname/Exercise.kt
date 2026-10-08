package k021

fun nickname(name: String?): String = name?.trim()?.takeIf { it.isNotEmpty() } ?: "Guest"
