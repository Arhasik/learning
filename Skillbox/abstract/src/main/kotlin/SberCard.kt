class SberDebitCard (): DebitCard () {
    var bonuses: Double = 0.0

    override fun pay(payProducts: Int) {
        super.pay(payProducts)
        bonuses += payProducts * 0.01
    }

    override fun getInformationCash() {
        println("Yours available funds = $balance")
        println("Yours bonuses = $bonuses")
    }
}