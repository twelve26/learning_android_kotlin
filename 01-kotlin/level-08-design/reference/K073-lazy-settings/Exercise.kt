package k073

fun settings(loader: () -> String): Lazy<String> = lazy(loader)
