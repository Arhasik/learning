package task3

class Cat : Animal() {
    override var age: Int = 2

    override var health: Int = 100

    override fun makeSound() {
        println("Мяу")
    }
}