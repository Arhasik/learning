import kotlin.random.Random

class NatureReserve {
    var listAnimal = mutableListOf<Animal>()

    init {
        populateReserve()
    }

    fun populateReserve () {
        repeat(5) {
            listAnimal.add(Bird(energy = Random.nextInt(1,20), weight = Random.nextInt(1,5), maxAge = 3, name = "Bird $it"))
        }
        repeat(3) {
            listAnimal.add(Fish(energy = Random.nextInt(1,20), weight = Random.nextInt(1,5), maxAge = 4, name = "Fish $it"))
        }
        repeat(2) {
            listAnimal.add(Dog(energy = Random.nextInt(1,20), weight = Random.nextInt(1,5), maxAge = 2, name = "Dog $it"))
        }
        repeat(2) {
            listAnimal.add(Animal(energy = Random.nextInt(1,20), weight = Random.nextInt(1,5), maxAge = 2, name = "Animal $it"))
        }
    }

    fun showAnimals (list:MutableList<Animal>) {
        println("Animals in the reserve:")
        list.forEach { println("Energy - ${it.energy}, weight - ${it.weight} maxAge - ${it.maxAge}, name - ${it.name}") }
    }

}


