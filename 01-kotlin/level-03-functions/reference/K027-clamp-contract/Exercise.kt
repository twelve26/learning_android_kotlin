package k027

fun clamp(x: Int, min: Int, max: Int): Int = run {
    require(min <= max)
    x.coerceIn(min, max)
}
