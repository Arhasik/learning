class Dollar(): CurrencyConverter {
    override val currencyCode: String = "USD"
    override fun convertRub(amountOfMoney: Int) {
        val amountOfRub = amountOfMoney / 100.0
        println("$amountOfMoney RUB  = $amountOfRub $currencyCode")
    }





}