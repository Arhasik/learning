import kotlin.math.abs

open class CreditCard ():BankCard () {
    override var balance: Double = 0.0
    var creditLimit: Double = 0 * -1.0


   override fun refill(refillBalance: Int) {
        creditLimit += refillBalance
        if (creditLimit >= 0) {
            balance =  creditLimit
            creditLimit = 0.0
        }
   }

   override fun pay(payProducts: Int) {
        balance -= payProducts
        if (balance <= 0 ) {
            creditLimit += balance
            balance = 0.0
        }
    }

    override fun getInformationBalance() {
        println("You available funds = $balance")

    }

    override fun getInformationCash() {
        println("Yours balance = $balance")
        println("Yours balance credit = ${abs(creditLimit)}")    }
}