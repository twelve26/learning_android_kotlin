package lab.android
fun boundedProgress(value: Int): Int = value.coerceIn(0, 100)
