package task5

class SmartTV(name: String, var channel: Int): SmartDevice (name = name) {

    override fun turnOn() {
        super.turnOn()
        println("Tv show $channel")
    }
}