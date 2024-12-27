package task10

sealed class Transaction {
    class Deposit( var amount: Double ) : Transaction()
    class Withdraw ( var amount: Double ): Transaction()
    class Transfer ( var amount: Double , val toAccount: String): Transaction()
}
