//Напишите программу, которая запрашивает у пользователя число n и выполняет обратный отсчет до 0.
//Используйте цикл do-while. Выводите каждое число на новой строке.
fun main() {
    println("Enter number")
    var n = readLine()!!.toInt()
    do {
        println(n)
        n -= 1
        Thread.sleep(1000)
    } while (n >= 0)
}


