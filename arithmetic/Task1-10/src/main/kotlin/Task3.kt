fun main() {
//Умножение двух чисел:
//Напишите программу, которая принимает два числа от пользователя, умножает их и выводит результат.
    println("Enter first number")
    val numberOne: String? = readLine()
    println("Enter second number")
    val numberTwo: String? = readLine()
    if ((numberTwo?.matches("""\d+""".toRegex()) == true && numberOne?.matches("""\d+""".toRegex()) == true) )
    {
        val numberOneInt: Int = numberOne.toInt()
        val numberTwoInt: Int = numberTwo.toInt()
        val multiplication = numberOneInt * numberTwoInt
        println("Multiplication = $multiplication")
    }
    else {
        println("Error you had to enter a number")
    }
}