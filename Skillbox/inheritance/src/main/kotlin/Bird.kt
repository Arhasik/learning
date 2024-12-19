import kotlin.random.Random

class Bird (energy: Int,
            weight: Int,
            maxAge: Int,
            name: String,
) : Animal (energy, weight, maxAge, name) {

    override fun move() {
        super.move()
        println("$name Fly")
    }

    override fun bornBabyAnimal() :Bird? {
        print("$name Bird ")
        val child = super.bornBabyAnimal() ?: return null
        return Bird(child.energy, child.weight, maxAge, name)
    }
}