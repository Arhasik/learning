import kotlin.random.Random
import kotlin.random.nextInt

open class Animal(
    var energy: Int,
    var weight: Int,
    val maxAge: Int,
    val name: String,
) {
     var currentAge: Int = 0

    fun isTooOld (): Boolean {
        return currentAge >= maxAge
    }

    fun sleep () {
            energy += 5
            currentAge += 1
            println("An animal named - $name sleep")
    }

    fun eat () {
            energy += 3
            weight += 1
            tryIncrementAge()
            println("An animal named - $name eat")
    }
    open fun move () {
        if (!isTooOld()) {
            if (energy >= 5) {
                energy -= 5
            } else println("Animal $name can't move, without enough energy")
            if (weight > 1) {
                weight -= 1
            } else println("Animal $name can't move, without enough weight")
                tryIncrementAge()
            println("An animal named - $name move")
        }
        if (currentAge >= maxAge) {
            println("Animal $name can't move, it's too old ")
        }
    }

    fun tryIncrementAge (): Int {
        if (Random.nextBoolean()) {
            currentAge += 1
        }
        return currentAge
    }

    open fun bornBabyAnimal (): Animal? {
        if (isTooOld()) return null
        val child = Animal(
            name = name,
            energy = Random.nextInt(1, 11),
            weight = Random.nextInt(1, 6),
            maxAge = maxAge
        )
        println("Born: ${child.name}, energy: ${child.energy}, weight: ${child.weight}")
        return child
    }
}