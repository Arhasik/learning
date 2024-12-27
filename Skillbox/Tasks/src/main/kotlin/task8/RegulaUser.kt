package task8

class RegularUser(name: String, email: String?,
                  var memberShipLevel: MemberShipLevel) : User(name, email) {

    override var role: String = "User"

    override fun userInfo() {
        println("[User] $name - Email: ${email ?: "Not specified"}, Membership: $memberShipLevel")
    }
}