package task13

class Logger {
    fun log (message: Any) {
        when (message) {
            is String -> println("String: $message")
            is Int -> println("Number: $message")
            is Double -> println("Number: $message")
            else -> println("Object: $message")
        }
    }
}