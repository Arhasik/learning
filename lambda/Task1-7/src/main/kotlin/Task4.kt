//Напишите функцию, которая принимает список чисел и лямбда-выражение для нахождения максимального значения,
//которое удовлетворяет определенному условию. Например, максимальное число, меньшее 5.

fun main() {
    val list = listOf<Int>(1,2,3,4,5,6,7,8)
    val lambda = maximumValue(list, {it < 5})
    println(lambda)
}
fun maximumValue (list: List<Int>, lambda: (Int) -> Boolean): Int? {
    return list.filter(lambda).maxOrNull()
}