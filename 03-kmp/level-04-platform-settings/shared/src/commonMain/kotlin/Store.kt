package lab.shared
interface StringStore {
    fun read(key: String): String?

    fun write(key: String, value: String)
}

expect fun platformName(): String

expect fun platformStore(): StringStore
