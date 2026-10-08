package k052

fun pipeline(value: Int, operations: List<(Int) -> Int>): Int =
    operations.fold(value) { a, op -> op(a) }
