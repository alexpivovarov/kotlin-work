// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inputDocument: String, toRedact: String, editChar: Char='X') : String {
    var mask = editChar.toString() // *
    val length = toRedact.length // 3
    mask = mask.repeat(length) // ***


    return inputDocument.replace(toRedact, mask)
}
