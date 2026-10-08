package k047
data class Rectangle(val width: Int, val height: Int)

fun area(rect: Rectangle): Long = run {
    require(rect.width >= 0 && rect.height >= 0)
    rect.width.toLong() * rect.height
}
