package k062

fun config(lines: List<String>): Map<String, String> = buildMap {
    for (raw in lines) {
        val s = raw.trim()
        if (s.isEmpty() || s.startsWith("#")) continue
        val i = s.indexOf('=')
        require(i > 0)
        put(s.substring(0, i).trim().also { require(it.isNotEmpty()) }, s.substring(i + 1).trim())
    }
}
