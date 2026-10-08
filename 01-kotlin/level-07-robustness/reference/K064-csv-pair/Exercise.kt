package k064

fun csv(row: String): Pair<String, String> = run {
    require('"' !in row)
    val p = row.split(",")
    require(p.size == 2)
    p[0] to p[1]
}
