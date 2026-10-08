package lab.shared
class CourseFacade {
    private val visits = VisitCounter(platformStore())

    fun act(): String = "${platformName()}: persisted visits ${visits.next()}"
}
