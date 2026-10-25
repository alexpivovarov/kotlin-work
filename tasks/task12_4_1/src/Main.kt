// Task 12.4.1: main program
fun main() {
    val CircleA = Circle(Point(0.0, 0.0), 5.0)
    val a = CircleA.area()
    println(a)
    val d = CircleA.contains(Point(99.0, 99.0))
    println(d)
}