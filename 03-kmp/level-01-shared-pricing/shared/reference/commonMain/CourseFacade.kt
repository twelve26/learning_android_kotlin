package lab.shared
class CourseFacade {

    fun act(): String = "Cart total: ${totalCents(listOf(1250,750),10)} cents"
}
