import java.util.Random

//Напишите функцию, которая принимает список целых чисел и возвращает сумму всех положительных чисел, которые делятся на 3.

fun main() {
    val list = mutableListOf<Int>(1,2,3,4,5,6-1,-2,-3,-4,-5,6)
println(list)
    println(positiveNumber(list))

}
fun positiveNumber (list: List<Int>):Int {
    var sum = 0
for (i in list) {
    if (i > 0 && i % 3 == 0){
        sum += i
    }
}
    return sum
}