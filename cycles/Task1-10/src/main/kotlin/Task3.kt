//Напишите программу, которая запрашивает у пользователя число x и умножает его на 2 до тех пор,
//пока результат не станет больше 1000. Используйте цикл while. Выведите промежуточные результаты на экран.
fun main() {
    println("Enter number")
var x = readLine()!!.toInt()
 while (x < 1000) {
     println(x)
     x *= 2
 }
}


