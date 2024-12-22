fun main() {
    val creditCard = SberCreditCard()
    val debitCard = SberDebitCard()
    creditCard.refill(10000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.pay(3000)
    creditCard.refill(10000)
    creditCard.getInformationCash()
    println("---------------------------------")
    debitCard.refill(10000)
    debitCard.pay(4000)
    debitCard.pay(4000)
    debitCard.pay(4000)
    debitCard.getInformationCash()




}