package k023

fun port(text: String): Int? = text.trim().toIntOrNull()?.takeIf { it in 1..65535 }
