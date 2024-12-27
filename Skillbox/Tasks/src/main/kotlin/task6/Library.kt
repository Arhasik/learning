package task6

object Library {
    var listBook = mutableListOf<Book>()

    fun addBook(book: Book) {
        listBook.add(book)
        println("Book '${book.title}' added in the library!")

    }


    fun showBook() {
        if (listBook.isEmpty()) {
            println("There is no book in the library")
        } else {
            listBook.forEach{it.info()}
        }
    }
    fun findBook(title: String) {
        val foundBook = listBook.find { it.title == title }
        if (foundBook!=null) {
            println("Book '$title' found in library!")
            foundBook.info() // Выведем её информацию
        } else {
            println("Book '$title' there is no library.")

        }

    }
}
