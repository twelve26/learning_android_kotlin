package k054

fun accepts(value: String, rules: List<(String) -> Boolean>): Boolean = rules.all { it(value) }
