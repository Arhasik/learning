package task10

enum class TransactionStatus(var message: String) {
    PENDING(message = "Pending"),
    COMPLETED(message = "Completed"),
    FAILED(message = "Failed"),
}