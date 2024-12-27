package task3

abstract class Animal () {
    abstract var age: Int
    abstract var health: Int

    abstract fun makeSound ()
   open fun sleep () {
        println("Сплю...")
    }
}