package task11

class Person (age: Int) {
    var age: Int = age
        get() {
            println("Task1")
            return field
        }
        set(value) {
            if (value < 0 ) {
                field = 0
            }
        }

}