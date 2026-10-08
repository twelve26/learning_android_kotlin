package k080

fun fromJava(value: java.util.Optional<String>): String? =
    value.orElse(null)?.trim()?.takeIf(String::isNotEmpty)
