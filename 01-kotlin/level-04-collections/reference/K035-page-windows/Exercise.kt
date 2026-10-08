package k035

fun pages(items: List<Int>, size: Int): List<List<Int>> = items.chunked(size)
