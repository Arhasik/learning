package task11

class BankAccount (balance: Int) {
     var balance: Int = balance
         get() {
             println("Task2")
             return if (field == 0) {
                 -1
             } else field
         }
         set(value) {
             if (value < 0 ) {
                 field = 0
             }
         }

}