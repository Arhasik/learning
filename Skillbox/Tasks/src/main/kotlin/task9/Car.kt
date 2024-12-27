package task9

open class Car(speed: Int = 100, fuel: Double = 45.0, capacity: Int = 4 ): Vehicle(speed, fuel, capacity) {
    override fun move() {
        println("Moving at speed")
    }

    override fun refuel (amount: Double) {
        fuel += amount
        println("Refilled with $amount liters")
    }
}