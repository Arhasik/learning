import kotlin.math.abs

class SberCreditCard (): CreditCard () {
    var bonuses: Double = 0.0
    var cashBack: Double = 0.0
    var savingMoney: Double = 0.0

    override fun refill(refillBalance: Int) {
        super.refill(refillBalance)
        savingMoney += refillBalance * 0.005

    }
    var amountFromPurchases = 0

    override fun pay(payProducts: Int) {
        super.pay(payProducts)
        amountFromPurchases += payProducts
        if (amountFromPurchases >= 5000) {
            cashBack = amountFromPurchases * 0.05
        }
        bonuses += payProducts * 0.01
    }
    override fun getInformationCash() {
        super.getInformationCash()
        println("Yours bonuses = $bonuses")
        println("Yours cash back = $cashBack")
        println("Yours saving money = $savingMoney")

    }
}
