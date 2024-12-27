package task10

sealed class AppEvent {
    class Login (val user: String):AppEvent() {

    }
    class Logout (val user: String):AppEvent()  {

    }
    class Error (val message: String):AppEvent() {

    }


}



