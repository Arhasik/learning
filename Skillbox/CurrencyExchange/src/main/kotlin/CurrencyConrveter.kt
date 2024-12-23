import kotlin.random.Random
import kotlin.random.nextInt

interface CurrencyConverter {
    val currencyCode: String
    fun convertRub(amountOfMoney:Int)
}