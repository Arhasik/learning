class Euro: CurrencyConverter {
    override val currencyCode: String = "EUR"

    override fun convertRub(amountOfMoney: Int) {
        val amountOfRub = amountOfMoney / 110.0
        println("$amountOfMoney RUB  = $amountOfRub $currencyCode")
    }
}