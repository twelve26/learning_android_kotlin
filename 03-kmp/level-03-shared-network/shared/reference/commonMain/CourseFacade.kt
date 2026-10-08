package lab.shared
class CourseFacade {

    fun act(): String = "Fixture: ${parseBooks("[{\"id\":1,\"title\":\"Kotlin\"}]").first().title}"
}
