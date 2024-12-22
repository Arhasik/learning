abstract class BankCard () {
    abstract var balance: Double
    abstract fun refill (refillBalance: Int)
    abstract fun pay (payProducts: Int)
    abstract fun getInformationBalance ()
    abstract fun getInformationCash ()
}