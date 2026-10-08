package lab.android
fun validate(name: String, email: String): String? =
    when {
        name.isBlank() -> "Name is required"
        !email.matches(Regex("[^ @]+@[^ @]+\\.[^ @]+")) -> "Enter a valid email"
        else -> null
    }
