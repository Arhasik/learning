fun main() {
//Вычитание двух чисел:
//Напишите программу, которая принимает два числа от пользователя, вычитает второе число из первого и выводит результат.
    println("Enter first number")
    val numberOne: String? = readLine()
    println("Enter second number")
    val numberTwo: String? = readLine()
    if ((numberTwo?.matches("""\d+""".toRegex()) == true && numberOne?.matches("""\d+""".toRegex()) == true) )
    {
        val numberOneInt: Int = numberOne.toInt()
        val numberTwoInt: Int = numberTwo.toInt()
        val difference = numberOneInt - numberTwoInt
        println("Difference = $difference")
    }
    else {
        println("Error you had to enter a number")
    }
}