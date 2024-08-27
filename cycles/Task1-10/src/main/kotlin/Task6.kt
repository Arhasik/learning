//Напишите функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число.
//Если отрицательного числа нет, функция должна вернуть null. Используйте цикл for и оператор break

fun main() {
    val list = listOf<Int>(1,2,3,-3,-2,-5)
    println(findFirstNegative(list))

    val list1 = listOf<Int>(1,2,3,4,5,6,7)
    println(findFirstNegative(list1))

}
fun findFirstNegative (number: List<Int>): Int? {
    for (i in number) {
        if (i <= 0)
            return i
    }
    return null
}