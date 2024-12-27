package task4

class Car(speed: Int,
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
              fun honk () {
                  println("Бип-бип")
              }
}