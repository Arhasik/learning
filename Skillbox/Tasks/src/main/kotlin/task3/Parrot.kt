package task3

class Parrot: Animal () {
    override var age: Int = 1

    override var health: Int = 80

    override fun makeSound() {
        println("Кар")
    }

    override fun sleep() {
        println ("Сплю...хрррр")
    }
}