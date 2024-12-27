package task4

abstract class Transport(var speed: Int,
                var fuel: Double,
                var passenger: Int,
                var maxSpeed: Int,
                var refillTank: Double,
) {

    fun move () {
        if (fuel > 0) {
            fuel -= speed * 0.1
            println("движение со скоростью ${speed} км/ч")
        }else {
            println("нужно заправиться")
        }
    }

    fun stop() {
        println("Транспорт остановился")
    }

    fun refuel(amount: Double) {

        println("Средство зарпавилось на $amount л.")
        if (fuel + amount >= refillTank) {
            fuel = refillTank
            println("Бак полный (${fuel} л.)")
        } else {
            fuel += amount
            println("Средство заправилось на $amount л. Теперь топлива: $fuel л.")
        }
    }
}