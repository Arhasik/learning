package task14

import task9.printInfo

fun main() {
    val circle = Circle(2.0)
    val rectangle = Rectangle(2.0, 3.0)
    val square = Square(2.0)

    val objects: List<Any> = listOf(
        Circle(5.0),
        Rectangle(4.0, 6.0),
        "Это просто строка",
        Square(3.0),
        42
    )
    for (i in objects) {
        if (i is Shape) {
            val shape = i as Shape
            println("Фигура: ${shape.javaClass.simpleName}, Площадь: ${shape.getArea()}")

        } else {
            println("Объект $i не является фигурой")

        }
    }


    printShapeInfo(circle)
    printShapeInfo(rectangle)
    printShapeInfo(square)


}
fun printShapeInfo(shape: Shape) {
    when (shape) {
        is Circle -> {
            val area = Math.PI * shape.radius * shape.radius
            println("Фигура: Круг, Радиус: ${shape.radius}, Площадь: %.2f".format(area))
        }

        is Rectangle -> {
            val area = shape.width * shape.height
            println("Фигура: Прямоугольник, Ширина: ${shape.width}, Высота: ${shape.height}, Площадь: $area")
        }

        is Square -> {
            val area = shape.side * shape.side
            println("Фигура: Квадрат, Сторона: ${shape.side}, Площадь: $area")
        }

        else -> println("Неизвестная фигура")
    }
}