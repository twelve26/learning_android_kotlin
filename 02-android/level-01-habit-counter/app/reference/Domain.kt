package lab.android
fun nextCount(current: Int, delta: Int): Int = (current + delta).coerceIn(0, 20)
