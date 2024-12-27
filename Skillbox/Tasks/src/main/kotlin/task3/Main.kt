package task3

fun main () {

val zooAnimals = listOf<Animal>(Cat(), Dog(), Parrot())

    zooAnimals.forEach { it -> it.makeSound() }
    zooAnimals.forEach { it -> it.sleep() }
    zooAnimals.forEach { it -> println( it.age) }
    zooAnimals.forEach { it -> println( it.health) }

}