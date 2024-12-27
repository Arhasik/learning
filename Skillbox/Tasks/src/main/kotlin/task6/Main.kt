package task6

fun main () {
    val book1 = Book(title = "Might and magic", author = "Trulilishkin", year = 3)
    val book2 = Book(title = "Muchacha", author = "Plus")

    book1.info()
    book2.info()
    Library.addBook(book1)
    Library.addBook(book2)
    Library.findBook(title = "Might and magic")
    Library.findBook(title = "Bugaga")
    println("------")
    Library.showBook()
}