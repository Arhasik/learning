package task5

class Thermostat(name:String, var temperature : Int):SmartDevice(name) {

    override fun turnOn() {
        super.turnOn()
        println("Thermostat show $temperature")
    }
}