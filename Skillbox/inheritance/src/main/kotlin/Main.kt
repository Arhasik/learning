import kotlin.random.Random

fun main() {
    var natureReserve = NatureReserve()

    natureReserve.showAnimals(natureReserve.listAnimal)

    liveCycle(natureReserve)

    natureReserve.showAnimals(natureReserve.listAnimal)


}
fun liveCycle (natureReserve: NatureReserve) {
    for (i in 1..20) {
        for (animals in natureReserve.listAnimal.toMutableList()) {
            when (Random.nextInt(1, 5)) {
                1 -> animals.eat()
                2 -> animals.sleep()
                3 -> animals.move()
                4 -> animals.bornBabyAnimal()?.let { natureReserve.listAnimal.add(it) }
            }
            natureReserve.listAnimal.removeAll { animal ->
                if (animal.isTooOld()) {
                    println("${animal.name} dead")
                    true // Удалить животное
                } else {
                    false // Оставить животное
                }
            }


        if (natureReserve.listAnimal.isEmpty()) {
            println("TUTU")
        }
    }
}
}