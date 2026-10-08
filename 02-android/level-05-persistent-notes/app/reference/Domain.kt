package lab.android
fun cleanNote(text: String): String? = text.trim().takeIf { it.isNotEmpty() && it.length <= 200 }
