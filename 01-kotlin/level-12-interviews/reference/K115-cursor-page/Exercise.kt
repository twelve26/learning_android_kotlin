package k115

fun page(ids: List<Long>, cursor: Long?, size: Int): List<Long> =
    ids.asSequence().filter { cursor == null || it > cursor }.take(size).toList()
