class Yuan: CurrencyConverter {
    override val currencyCode: String = "CNY"

    override fun convertRub(amountOfMoney: Int) {
        val amountOfRub = amountOfMoney / 15.0
        println("$amountOfMoney RUB  = $amountOfRub $currencyCode")
    }
}