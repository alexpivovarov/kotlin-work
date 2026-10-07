// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val path = Path("test.txt")
    path.writeText("This is some text\n") 
    path.appendText("Appended this\n")

    val FileContents = path.readText()
    println(FileContents)
}


