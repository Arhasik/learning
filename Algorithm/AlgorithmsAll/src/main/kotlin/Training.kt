import kotlin.math.pow
import kotlin.random.Random

fun main() {
    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
//    val lada = Car(brand = "Lada", model = "Vesta", color = "White")
//    val bmw = Car(brand = "BMW", model = "X6")
    val renault = Car(buka = "Logan" to "Renault", color = "Blue")

    Car.
//    println("Auto info")
    fun printInfo(car: Car):String {
        return "Brand - ${car.brand},model - ${car.model}, color - ${car.color}"
    }
//    println(printInfo(vw))
//    println(printInfo(lada))
//    println(printInfo(bmw))
//    println(printInfo(renault))

renault.
}
class Car (val brand: String, val model: String, val color:String = "White") {

    constructor(buka: Pair<String, String>, color: String ): this (
    brand = buka.first,
    model = buka.second,
    color = color ) {
        println("Secondary constructor")
    }

    init{
        println("Car init")
    }
     var currentSpeed = 0.0
         get(){
             println("Current speed getter")
             return field
         }
         set(value) {
             field = value
             println("Current speed setter")
         }

  private   var fuelCount = 0.0

    init {
        println("Second init")
    }
    fun accelerate(speed: Double) {
        val needFuel = speed * 0.1
        if (fuelCount > needFuel) {
            currentSpeed += speed
            useFuel(speed * 0.1)
        }
        else
            println("Car need fuel ")
    }
    fun decelerate (speed: Double) {
        currentSpeed = maxOf(0.0, currentSpeed - speed )
    }
   private  fun useFuel(fuelCount:Double) {
        this.fuelCount -= fuelCount
    }

    fun move () {
        val distance = Random.nextInt(1, 10)
        println("Car passed $distance km")
    }


    fun start () {
        println("Car started")
    }
    fun stop () {
        println("Car stopped")
    }


companion object {
    const val wheelsCount = 4
    fun getCarClass(length: Double): String = when {
        length < 3.6 -> "A"
        length < 3.9 -> "B"
        length < 4.3 -> "C"
        length < 4.6 -> "D"
        length < 5 -> "E"
        else -> "F"

    }
}
}