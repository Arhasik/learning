//Напишите программу, которая запрашивает у пользователя логин и пароль и выводит "Добро пожаловать",
//если логин и пароль правильные (например, логин: "admin", пароль: "1234"), и "Неверные данные", если нет.
fun main() {
    println("Enter user name")
    val name: String? = readLine()
    println("Enter password")
    val password: String? = readLine()
    if (name == "admin" && password == "1234") {
        println("Welcome")
    }
    else {
        println("Incorrect data")
    }

}