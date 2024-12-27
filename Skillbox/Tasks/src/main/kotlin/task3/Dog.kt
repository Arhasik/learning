package task3

class Dog: Animal() {
    override var age: Int = 4

    override var health: Int = 90

    override fun makeSound() {
        println("Гав")
    }
}