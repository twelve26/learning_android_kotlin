package k019

fun alarm(values: List<Int>, threshold: Int): Int = values.indexOfFirst { it > threshold }
