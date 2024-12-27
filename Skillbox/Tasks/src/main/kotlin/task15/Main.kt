package task15

fun main () {
    val box1 = Box(content = "Papu")
    val box2 = Box(content = 1)
    val box3 = Box(content = 1.0)

printBoxContent(box1)
    printBoxContent(box2)
    printBoxContent(box3)


}
fun <T> printBoxContent(box: Box<T>) {
    println("Содержимое коробки: ${box.getContent()}")

}