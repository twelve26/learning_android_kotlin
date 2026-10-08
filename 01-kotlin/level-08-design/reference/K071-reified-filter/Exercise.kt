package k071

inline fun <reified T> select(values: List<Any?>): List<T> = values.filterIsInstance<T>()
