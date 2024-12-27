package task10

fun main () {
    val user1 = User(userName = "Pupa", age = 19, email = "Zalupa@mail.com")
    val user2 = User(userName = "Keka", age = 12, email = "Zakeka@mail.com")

    val listUser: MutableList<User> = mutableListOf()
    listUser.add(user1)
    listUser.add(user2)

    val filter = listUser.filter { it -> it.age > 18 }

    println(filter)

    val order1 = Order(nameClient = "Petr", mealType = MealType.DINNER, costOrder = 100)
    val order2 = Order(nameClient = "Xren", mealType = MealType.LUNCH, costOrder = 50)
    val order3 = Order(nameClient = "Pupa", mealType = MealType.BREAKFAST, costOrder = 25)

    val listOrder: MutableList<Order> = mutableListOf()
    listOrder.add(order1)
    listOrder.add(order2)
    listOrder.add(order3)

    println( listOrder.sumOf {it -> it.costOrder})



    val events = listOf<AppEvent>(
        AppEvent.Login("Pipi"),
        AppEvent.Logout("Bib"),
        AppEvent.Error("Invalid password")
    )

    events.forEach { handEvent(it) }


    val transaction = listOf<Transaction>(
        Transaction.Deposit(200.0),
        Transaction.Withdraw(-20.0),
        Transaction.Transfer(-20.0, "1234567890"),
    )
    transaction.forEach { eventTransaction(it) }

val balance = transaction.sumOf {
    when (it) {
        is Transaction.Deposit -> it.amount
        is Transaction.Withdraw -> it.amount
        is Transaction.Transfer -> it.amount

} }

    println(balance)

}
fun eventTransaction (event: Transaction) {
    when (event) {
        is Transaction.Deposit -> println("${TransactionStatus.COMPLETED}")
        is Transaction.Withdraw -> println("${TransactionStatus.COMPLETED}")
        is Transaction.Transfer -> println("${TransactionStatus.COMPLETED}")
    }
}

fun handEvent(event: AppEvent) {
    when (event) {
        is AppEvent.Login -> println("User - ${event.user} logged in")
        is AppEvent.Logout -> println("User - ${event.user} logged out")
        is AppEvent.Error -> println("Error occurred: ${event.message}")

    }

}