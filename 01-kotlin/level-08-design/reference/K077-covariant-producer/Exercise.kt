package k077
open class Animal(val name: String)

class Dog(name: String) : Animal(name)

fun interface Producer<out T> {
    fun get(): T
}

fun animalName(producer: Producer<Animal>): String = producer.get().name
