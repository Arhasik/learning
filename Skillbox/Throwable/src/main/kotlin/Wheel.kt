class Wheel() {
    var currentPressure: Double = 0.0


    fun inflateWheel(pressure: Double) {
        when {
            pressure < 0 || pressure > 10 -> throw IncorrectPressure("Некорректное давление: $currentPressure атм")
            pressure < 1.6 -> throw TooLowPressure()
            pressure > 2.5 -> throw TooHighPressure()
            else -> {
                this.currentPressure = pressure
                println("Колесо накачано до $pressure атмосфер")
            }
        }
    }

    // Функция для проверки давления
    fun checkPressure() {
        when {
            currentPressure < 1.6 -> throw TooLowPressure()
            currentPressure > 2.5 -> throw TooHighPressure()
            else -> println("Давление в норме: $currentPressure атмосфер")
        }
    }
}