package task8

abstract class User(var name: String, var email: String?) {
    abstract var role: String


    open fun userInfo() {
        println("User: $name, Role: $role, Email: ${email ?: "Not specified"}")
    }

companion object {
    private val listUser: MutableList<User> = mutableListOf()

    fun addUser(user: User) {
        listUser.add(user)
        println("User added: ${user.name}")
    }

    fun findUser(username: String) {
        val userFind = listUser.firstOrNull { it.name == username }
        if (userFind != null) {
            println("User found: $username")
        } else {
            println("User not found.")
        }
    }

    fun showUsers() {
        println("\nAll users:")
        listUser.forEach { it.userInfo() }
    }
}

}