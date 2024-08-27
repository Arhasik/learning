//Напишите простую программу-калькулятор, которая принимает два числа и оператор (+, -, *, /) и выводит результат операции.
// Используйте when для обработки операторов.
fun main() {
    println("Enter first number")
    val numberFirst = readLine()!!.toInt()
    println("Enter operator action")
    val operator: String? = readLine()
    println("Enter second number")
    val numberSecond = readLine()!!.toInt()



    val result = when (operator) {
        "+"-> "$numberFirst + $numberSecond = ${numberFirst + numberSecond}"
        "-"-> "$numberFirst - $numberSecond = ${numberFirst - numberSecond}"
        "*"-> "$numberFirst * $numberSecond = ${numberFirst * numberSecond}"
        "/"-> "$numberFirst / $numberSecond = ${numberFirst / numberSecond}"
        else -> "Enter correct operator or number"
    }
    println(result)
}