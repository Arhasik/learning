fun main(args: Array<String>) {
    val wheel = Wheel()

    val testPressures = listOf(2.0, 3.0, -1.0, 11.0, 1.0)

    for (pressure in testPressures) {
        try {
            println("Попытка накачать колесо до $pressure атмосфер...")
            wheel.inflateWheel(pressure)
            wheel.checkPressure()
        } catch (e: IncorrectPressure) {
            println("Ошибка: ${e.message}")
        } catch (e: TooLowPressure) {
            println("Ошибка: надо подкачаться . Колесо не готово к эксплуатации!")
        } catch (e: TooHighPressure) {
            println("Ошибка: надо приспустить. Колесо не готово к эксплуатации!")
        }
        println("-------------------------------")
    }
}