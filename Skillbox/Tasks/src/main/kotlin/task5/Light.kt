package task5

class Light (name: String, var brightness: Int): SmartDevice(name) {
    override fun turnOn () {
        super.turnOn()
        println("Light On with brightness - $brightness")
    }
}