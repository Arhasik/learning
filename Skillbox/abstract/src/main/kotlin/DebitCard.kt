open class DebitCard ():BankCard () {
    override var balance: Double = 0.0


    override fun refill (refillBalance: Int) {
        balance += refillBalance
    }

    override fun pay(payProducts: Int) {
        balance -= payProducts
        if (balance <= 0) {
            balance += payProducts
            println("Error")
        }
    }

    override fun getInformationBalance() {
        println("Yours available funds = $balance")

    }

    override fun getInformationCash() {
        println("Yours available funds = $balance")
    }
}