
//Напишите функцию sumEvenUntilNegative, которая принимает список целых чисел и возвращает сумму всех четных чисел до первого отрицательного числа.
//Используйте цикл for, оператор break, и проверку на четность.
fun main() {
    val list = listOf<Int>(1,2,3,4,5,6,7,-3,5,10)
    println(sumEvenUntilNegative(list))
    val list1 = listOf<Int>(1,2,3,4,5,6,7,3,5,10)
    println(sumEvenUntilNegative(list1))
    val list2 = listOf<Int>(1,2,-3,4,5,6,7,3,5,10)
    println(sumEvenUntilNegative(list2))

}

fun sumEvenUntilNegative (list: List<Int>):Int {
    var summa = 0
    for (x in list) {
        if (x > 0 && x % 2 == 0) {
            summa += x
        }
        if (x < 0) {
            break
        }
    }
    return summa
}


