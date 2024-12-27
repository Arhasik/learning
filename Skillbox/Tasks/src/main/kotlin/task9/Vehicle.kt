package task9

 abstract class Vehicle(var speed: Int = 1000, var fuel: Double = 1000.0, var capacity: Int ) {
     open fun move() {
        println("Moving at speed")
    }

    open fun refuel (amount: Double) {
        fuel += amount
        println("Refilled with $amount liters")
    }
}