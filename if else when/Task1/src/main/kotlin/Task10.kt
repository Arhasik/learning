//Напишите программу, которая запрашивает возраст пользователя и выводит сообщение:
//•	"Доступ разрешен", если возраст больше или равен 18,
//•	"Доступ запрещен", если возраст меньше 18.
fun main() {
    println("Enter your age")
    val age = readLine()?.toIntOrNull()
    if (age !== null) {
        if (age >= 18) {
            println("access is allowed")
        } else {
            println("access is denied")
        }
    }
    else {
        println("Enter number")
    }
}