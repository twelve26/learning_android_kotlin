package k036

fun changes(values: List<Int>): List<Long> = values.zipWithNext { a, b -> b.toLong() - a }
