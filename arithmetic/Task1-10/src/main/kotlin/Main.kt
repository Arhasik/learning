//Сложение двух чисел:
//Напишите программу, которая принимает два числа от пользователя, складывает их и выводит результат.
fun main() {
    println("Enter first number")
    val numberOne: String? = readLine()
    println("Enter second number")
    val numberTwo: String? = readLine()
    if ((numberTwo?.matches("""\d+""".toRegex()) == true && numberOne?.matches("""\d+""".toRegex()) == true) )
    {
        val numberOneInt: Int = numberOne.toInt()
        val numberTwoInt: Int = numberTwo.toInt()
        val sum = numberOneInt + numberTwoInt
        println("Summa = $sum")
    }
    else {
        println("Error you had to enter a number")
    }
}