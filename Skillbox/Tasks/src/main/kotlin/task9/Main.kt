package task9

fun main () {
    val car = Car(capacity = 4)
    val childrenCar1 = ChildrenCar(speed = 80, fuel = 15.0, capacity = 2)
    val childrenCar2 = ChildrenCar(speed = 80)

    printInfo(car)
    printInfo(childrenCar1)
    printInfo(childrenCar2)


}
fun printInfo(car: Vehicle) {
    println("${car.speed}, ${car.fuel}, ${car.capacity}")

}