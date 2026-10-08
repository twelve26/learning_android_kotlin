package k065

fun compareVersions(a: String, b: String): Int = run {
    fun parts(s: String) = s.split(".").map { it.toInt().also { n -> require(n >= 0) } }
    val x = parts(a)
    val y = parts(b)
    (0 until maxOf(x.size, y.size)).firstNotNullOfOrNull { i ->
        (x.getOrElse(i) { 0 }).compareTo(y.getOrElse(i) { 0 }).takeIf { it != 0 }
    } ?: 0
}
