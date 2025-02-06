package task16

fun main () {
    val temperatureSensor = TemperatureSensor()
    val listTemperature =
        mutableListOf<Double>(-60.0, 110.0,-300.0,30.0)

    for (i in listTemperature) {
        try {
            temperatureSensor.setTemperature(i)
            temperatureSensor.checkTemperature()
        } catch (e: InvalidTemperatureException) {
            println("${e.message}")
        } catch (e: TooLowTemperatureException) {
            println("${e.message}")
         }catch (e: TooHighTemperatureException) {
            println("${e.message}")
        } catch (e: UnsafeTemperatureException) {
            println("${e.message}")
        }
    }

}