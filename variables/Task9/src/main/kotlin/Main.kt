//Объявите константу MAX_ATTEMPTS типа Int и присвойте ей значение 5. Создайте переменную currentAttempts
//и инициализируйте её значением 0. Напишите программу, которая будет увеличивать currentAttempts на 1 в цикле до тех пор,
//пока значение currentAttempts не станет равно MAX_ATTEMPTS. Выведите количество попыток на экран.
const val MAX_ATTEMPTS: Int = 5
fun main() {
var currentAttempts: Int = 0
    while (currentAttempts <= MAX_ATTEMPTS) {
        currentAttempts++
    }
    println("Amount try $currentAttempts")

}