package k040

fun join(ids: List<Int>, names: Map<Int, String>): List<String> = ids.mapNotNull { names[it] }
