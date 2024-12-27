package task7

fun main () {
    val student1 = Student(name = "Pic'ka")
    val student2 = Student(
        name = "Kupi",
        age = 20,
        listSubject = mutableListOf("Geometry", "Geography", "Math" ))



    Student.addStudent(student1)
    Student.addStudent(student2)
    Student.showStudents()
    Student.findStudent(name = "Kupi")
    Student.findStudent(name = "bugaga")



}