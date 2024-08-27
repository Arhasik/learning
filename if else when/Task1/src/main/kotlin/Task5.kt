//Напишите программу, которая принимает оценку (число от 0 до 100) и выводит:
//•	"Отлично", если оценка от 90 до 100,
//•	"Хорошо", если оценка от 70 до 89,
//•	"Удовлетворительно", если оценка от 50 до 69,
//•	"Неудовлетворительно", если оценка ниже 50.

fun main() {
    println("Enter mark")
    val mark = readLine()!!.toInt()

    when (mark) {
        in 90..100->  println("Excellent")
        in 70..89->  println("Good")
        in 50..69->  println("Satisfactory")
        in 1..49->  println("Unsatisfactory")

        else -> println("Enter correct number")
    }
}