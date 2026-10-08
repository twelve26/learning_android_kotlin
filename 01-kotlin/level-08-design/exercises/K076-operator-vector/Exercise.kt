package k076
data class Vector(val x: Int, val y: Int) {
    operator fun plus(other: Vector) = Vector(x + other.x, y + other.y)
}

fun combine(a: Vector, b: Vector): Vector = TODO("K076: Operator vector")
