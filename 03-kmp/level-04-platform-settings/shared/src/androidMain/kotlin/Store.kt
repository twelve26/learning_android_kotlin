package lab.shared
private lateinit var appContext: android.content.Context

fun initializeStorage(context: android.content.Context) {
    appContext = context.applicationContext
}

actual fun platformName() = "Android"

actual fun platformStore(): StringStore {
    check(::appContext.isInitialized) {
        "Call initializeStorage(applicationContext) before creating CourseFacade"
    }
    val prefs = appContext.getSharedPreferences("learning-kmp", 0)
    return object : StringStore {
        override fun read(key: String) = prefs.getString(key, null)

        override fun write(key: String, value: String) {
            prefs.edit().putString(key, value).apply()
        }
    }
}
