import java.util.*

object Converters {
    val listConverters = listOf<CurrencyConverter>(Dollar(), Euro(), Yuan())

    var unknow = object: CurrencyConverter {
        override val currencyCode: String = "UNKNOW"

        override fun convertRub(amountOfMoney: Int) {
            println("Converter is missing")
        }
    }

    fun get(currencyCode: String): CurrencyConverter? {
        val upperCaseCode = currencyCode.uppercase(Locale.getDefault())
        listConverters.forEach { it ->
            if (upperCaseCode == it.currencyCode) {
                return it
            }
        }
        return unknow
    }
}


//        for (i in listConverters)
//            if (upperCaseCode == i.currencyCode) {
//                return i
//            }
//        return null
//    }
