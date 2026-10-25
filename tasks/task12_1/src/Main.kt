// Task 12.1: program that uses a Point object
fun main() {
    val p = Point(0.0, 0.0)
    p.x = 1.0
    p.y = 2.0
    val q = Point(4.5, 7.0)
    val origin = Point(0.0, 0.0)

    println(p.x)
    println(p.y)

    println(p.distanceTo(origin))
    println(p.distanceTo(q))
}