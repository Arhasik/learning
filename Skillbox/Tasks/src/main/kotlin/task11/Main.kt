package task11

fun main () {
val person1 = Person(20)
    person1.age = - 10


    println(person1.age)

    val bankAccount = BankAccount(20)
bankAccount.balance = -10

    println(bankAccount.balance)

    val user = User("adf")
    user.password = "asd"
    user.password = "asdasdasd"
    println( user.password)

val fail = File()
println(fail.content)
}