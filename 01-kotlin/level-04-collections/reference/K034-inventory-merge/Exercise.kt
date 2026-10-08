package k034

fun merge(a: Map<String, Int>, b: Map<String, Int>): Map<String, Int> =
    (a.keys + b.keys).associateWith { (a[it] ?: 0) + (b[it] ?: 0) }
