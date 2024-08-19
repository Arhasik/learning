//Объявите переменную numString типа String и присвойте ей строку, содержащую число.
//Преобразуйте эту строку в переменную типа Int и выведите её на экран.

fun main() {
val numString: String = "123"
    val numStringNowInt: Int = numString.toInt()
    println(numStringNowInt)
}