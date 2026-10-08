package k038

fun balances(deltas: List<Int>): List<Long> = deltas.runningFold(0L) { a, v -> a + v }.drop(1)
