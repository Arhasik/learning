package task11

class User(password: String) {
    var password: String = password
        get () = "*".repeat(field.length)

        set(value) {
            if (value.length >= 6 ) {
                field = value
            } else println("Error")
        }
}