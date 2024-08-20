import kotlin.random.Random
import kotlin.random.nextInt
//Напишите программу, которая проверяет, является ли введенная строка password равной "admin".
//Если условие выполняется, выведите "Доступ разрешен", иначе "Доступ запрещен".
fun main() {
    print("Enter password: ")
    val password = readLine()

    if (password == "admin") {
        println("Access is allowed")
    } else {
        println("Access is denied")
    }
}