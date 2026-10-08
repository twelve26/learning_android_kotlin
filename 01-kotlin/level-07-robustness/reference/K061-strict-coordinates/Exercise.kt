package k061

fun coordinates(text: String): Pair<Int, Int>? = run {
    val p = text.split(",")
    if (p.size != 2) null
    else {
        val a = p[0].trim().toIntOrNull()
        val b = p[1].trim().toIntOrNull()
        if (a == null || b == null) null else a to b
    }
}
