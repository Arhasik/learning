import kotlin.random.Random

fun main() {
    println("Hello World!")
var ammo = 40
    println(ammo.randomChance())

var stack = Stack<Ammo>()
    stack.clear()

}

fun Int.randomChance(): Boolean {
    return Random.nextInt(100) < this
}