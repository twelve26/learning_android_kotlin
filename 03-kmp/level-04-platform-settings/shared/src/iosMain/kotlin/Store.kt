package lab.shared

import platform.Foundation.NSUserDefaults

actual fun platformName() = "iOS"

actual fun platformStore(): StringStore =
    object : StringStore {
        private val defaults = NSUserDefaults.standardUserDefaults

        override fun read(key: String) = defaults.stringForKey(key)

        override fun write(key: String, value: String) {
            defaults.setObject(value, forKey = key)
        }
    }
