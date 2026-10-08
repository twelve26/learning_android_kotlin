package k011

fun category(age: Int): String =
    when {
        age < 0 -> "invalid"
        age < 12 -> "child"
        age < 18 -> "teen"
        else -> "adult"
    }
