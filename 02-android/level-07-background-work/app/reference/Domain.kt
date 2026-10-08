package lab.android
fun progressPercent(done: Int, total: Int): Int =
    if (total <= 0) 0 else ((done.toLong() * 100 / total).coerceIn(0, 100)).toInt()
