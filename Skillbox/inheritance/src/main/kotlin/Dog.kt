class Dog (energy: Int,
            weight: Int,
            maxAge: Int,
            name: String,
) : Animal (energy, weight, maxAge, name) {

    override fun move() {
        super.move()
        println("$name Run")
    }

    override fun bornBabyAnimal() :Dog? {
        print("$name Dog ")
        val child = super.bornBabyAnimal() ?: return null
        return Dog(child.energy, child.weight, maxAge, name)
    }
}