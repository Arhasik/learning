package task4

import kotlin.random.Random

fun main () {

    val car  = Car(speed = 120, maxSpeed = 200, fuel = 10.0, passenger = 4, refillTank = 40.0)
    car.move()
    car.refuel(amount = 20.0)
    car.stop()
    car.honk()

    val boat = Boat(speed = 80, maxSpeed = 120, fuel = 10.0, passenger = 2, refillTank = 20.0)
    boat.move()
    boat.refuel(amount = 20.0)
    boat.stop()
    boat.anchor()
}