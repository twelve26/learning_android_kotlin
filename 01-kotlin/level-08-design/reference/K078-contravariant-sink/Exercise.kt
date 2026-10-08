package k078
open class Animal(val name: String)

class Dog(name: String) : Animal(name)

fun interface Consumer<in T> {
    fun accept(value: T)
}

fun send(dogs: List<Dog>, consumer: Consumer<Dog>): Unit = dogs.forEach { consumer.accept(it) }
