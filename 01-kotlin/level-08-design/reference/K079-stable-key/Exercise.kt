package k079

fun keys(ids: List<String>): Set<String> = ids.map { it.lowercase() }.toSet()
