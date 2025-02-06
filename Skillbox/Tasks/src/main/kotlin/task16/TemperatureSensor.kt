package task16

class TemperatureSensor {
    var currentTemperature = 0.0

    fun setTemperature(value: Double) {
        if (value < -273.15) throw InvalidTemperatureException("There is no such temperature")
        if (value < -50.0) throw TooLowTemperatureException("Temperature is too low")
        if (value > 100.0) throw TooHighTemperatureException("Temperature is too high")

        currentTemperature = value
    }

    fun checkTemperature() {
        if (currentTemperature !in -50.0..0.0) {
            throw UnsafeTemperatureException("Unsafe temperature")
        }

    }
}

