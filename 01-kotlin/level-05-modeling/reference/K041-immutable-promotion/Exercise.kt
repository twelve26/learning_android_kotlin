package k041
data class User(val name: String, val premium: Boolean)

fun promote(user: User): User = user.copy(premium = true)
