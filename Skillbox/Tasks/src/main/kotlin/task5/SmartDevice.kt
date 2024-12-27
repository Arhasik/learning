package task5

abstract class SmartDevice (var name: String) {
    fun turnOf () {
        println("Device off")
    }
    open fun  turnOn () {
        println("Device on")
    }
}