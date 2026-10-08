package k108

fun maxSum(values: List<Int>): Long? =
    if (values.isEmpty()) null
    else {
        var current = values[0].toLong()
        var best = current
        for (v in values.drop(1)) {
            current = maxOf(v.toLong(), current + v)
            best = maxOf(best, current)
        }
        best
    }
