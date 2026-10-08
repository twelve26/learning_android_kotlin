package lab.shared

fun normalizedName(value: String): String = value.trim().take(40).ifBlank { "Guest" }
