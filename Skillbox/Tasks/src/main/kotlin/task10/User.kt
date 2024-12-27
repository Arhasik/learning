package task10

 data class User(
    var userName: String,
    var age: Int,
    var email: String
) {
     override fun toString(): String {
         return "Name - $userName, age - $age, email - $email"
     }

 }


