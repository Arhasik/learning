package task5

fun main () {
    val light = Light(name = "Light", brightness = 30)
    val smartTV = SmartTV(name = "Samsung", channel = 3)
    val thermostat = Thermostat(name = "Bosh", temperature = 24)

    val listDevice = listOf<SmartDevice>(light,smartTV,thermostat)
    listDevice.forEach {  it.turnOn(); it.turnOf()
    }


}