package k055

fun <T, R : Any> firstMapped(values: Sequence<T>, transform: (T) -> R?): R? =
    values.mapNotNull(transform).firstOrNull()
