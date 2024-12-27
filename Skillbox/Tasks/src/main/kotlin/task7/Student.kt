package task7

class Student(var name: String, var age: Int, var listSubject: MutableList<String>) {

    constructor (name: String,
    ): this (name,
        age = 3,
        listSubject = mutableListOf("Math", "Geometry", "PE")) {
    }

    fun studentInfo() {
        println("Name - $name, age - $age, subject - $listSubject ")
    }

    companion object {
        var studentDatabase = mutableListOf<Student>()

        fun addStudent (student: Student) {
            studentDatabase.add(student)
            println("Student ${student.name} added!")

        }

        fun showStudents() {
            if (studentDatabase.isEmpty()) {
                println("No students in the database.")
            } else {
                studentDatabase.forEach { it.studentInfo() }
            }
        }

        fun findStudent(name: String) {
            val student = studentDatabase.firstOrNull() {it.name == name}
            if (student != null)    {
                println("Student found: ${student.name}, Age: ${student.age}")
            } else {
                println("Student $name not found.")
            }
        }
    }

}