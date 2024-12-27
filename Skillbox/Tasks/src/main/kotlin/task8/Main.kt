package task8

fun main () {
    val regularUser = RegularUser(
        name = "Petr",
        email = "tratata@mail.com",
        memberShipLevel = MemberShipLevel.PREMIUM
    )

    val admin = Admin(name = "Vasilii", email = "pipiu@mail.com")

    User.addUser(admin)
    User.addUser(regularUser)
    User.findUser("Petr")
    User.findUser("Vasilii")
    User.findUser("Vasiliiaaa")

    User.showUsers()
}
