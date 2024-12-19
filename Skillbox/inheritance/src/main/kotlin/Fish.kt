class Fish (energy: Int,
            weight: Int,
            maxAge: Int,
            name: String,
) : Animal (energy, weight, maxAge, name) {

    override fun move() {
        super.move()
        println("$name Swim")
    }

    override fun bornBabyAnimal() :Fish? {
        print("$name Fish ")
        val child = super.bornBabyAnimal() ?: return null
        return Fish(child.energy, child.weight, maxAge, name)
    }
}