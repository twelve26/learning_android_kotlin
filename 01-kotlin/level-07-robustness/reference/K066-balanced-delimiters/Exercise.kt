package k066

fun balanced(text: String): Boolean = run {
    val stack = ArrayDeque<Char>()
    var ok = true
    for (c in text) when (c) {
        '(',
        '[',
        '{' -> stack.addLast(c)
        ')',
        ']',
        '}' -> {
            val expected =
                when (c) {
                    ')' -> '('
                    ']' -> '['
                    else -> '{'
                }
            if (stack.removeLastOrNull() != expected) ok = false
        }
    }
    ok && stack.isEmpty()
}
