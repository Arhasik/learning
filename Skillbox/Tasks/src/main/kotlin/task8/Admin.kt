package task8

class Admin(name: String, email: String) :User(name,email) {

    override var role: String = "Admin"
    private val privileges: List<String> = listOf("Manage users", "Edit content")

    override fun userInfo() {
        println("[Admin] $name - Email: ${email ?: "Not specified"}, Privileges: $privileges")
    }
}