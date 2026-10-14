// Task 5.1.2: main program
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: please supply the number of sides")
        println("Usage: Kotlin run <sides>")
    }
    val sides = args[0].toIntOrNull()
    val result = rollDie(sides)
    println(result)


}