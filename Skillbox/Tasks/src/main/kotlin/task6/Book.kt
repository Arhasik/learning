package task6

class Book(var title: String, var author: String, var year: Int) {

    constructor(title: String, author: String) : this(title, author, year = 2) {

    }

    fun info() {
        println("Title - $title, author - $author, year - $year")
    }


}