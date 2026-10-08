package k106

fun anagrams(words: List<String>): List<List<String>> =
    words.groupBy { it.toCharArray().sorted().joinToString("") }.values.toList()
