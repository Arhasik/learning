package task12

class Car (var engine:Engine) {
    fun drive() {
        engine.start()
        println("Car is moving")
    }

}