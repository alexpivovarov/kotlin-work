// Task 2.3

fun main() {
    val myAge = 13_800_000_000L /*  integer wrong - Long */
    val universeAge = 13_800_000_000L /* Long */
    val status = 'M' /*char Wrong Char */
    val name = "Sarah" /*  String  Correct*/
    val height = 1.78f /* Float */
    val root2 = Math.sqrt(2.0) /* Double */

    println(myAge::class)
    println(universeAge::class)
    println(status::class)
    println(name::class)
    println(height::class)
    println(root2::class)

    val pi: Double = 3.14159
}
/* 1)Indeed, it trigerred a compile error. 

 removing Float did not help

2) Bob is wrong as there is a compile error

3) Charlie is correct!! Appending f did help

4) Semicolon is not needed in Kotlin

5) Diane is correct!!
*/