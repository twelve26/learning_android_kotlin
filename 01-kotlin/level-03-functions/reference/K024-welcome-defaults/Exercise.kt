package k024

fun welcome(name: String = "Guest", times: Int = 1): String =
    List(times) { "Hello, $name!" }.joinToString(" ")
