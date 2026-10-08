package k026

fun extension(file: String): String? = run {
    val i = file.lastIndexOf('.')
    if (i <= 0 || i == file.lastIndex) null else file.substring(i + 1).lowercase()
}
