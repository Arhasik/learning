package task14

class Square(var side: Double):Shape() {
    override fun getArea(): Double {
        return side*2
    }
}