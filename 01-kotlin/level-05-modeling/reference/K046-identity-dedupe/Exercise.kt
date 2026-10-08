package k046
data class Contact(val id: Int, val name: String)

fun latest(contacts: List<Contact>): List<Contact> = contacts.associateBy { it.id }.values.toList()
