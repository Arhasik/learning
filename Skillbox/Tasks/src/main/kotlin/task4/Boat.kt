package task4

class Boat(speed: Int,
           fuel: Double,
           passenger: Int,
           maxSpeed: Int,
           refillTank: Double
) : Transport(
    speed,
    fuel,
    passenger,
    maxSpeed,
    refillTank
) {
    fun anchor() {
        println("Опущен якорь")
    }
}