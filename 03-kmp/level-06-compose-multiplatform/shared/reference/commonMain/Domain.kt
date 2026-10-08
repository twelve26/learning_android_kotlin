package lab.shared

fun toggle(ids: Set<Int>, id: Int): Set<Int> = if (id in ids) ids - id else ids + id
