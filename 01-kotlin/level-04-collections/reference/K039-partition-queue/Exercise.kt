package k039

fun partition(values: List<Int>, threshold: Int): Pair<List<Int>, List<Int>> =
    values.partition { it >= threshold }
