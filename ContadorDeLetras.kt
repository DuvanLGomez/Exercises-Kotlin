fun main(args: Array<String>) {
    println("Ingresa una letra: ")
    val letter: Char? = readLine()?.get(0)
    println("Ingresa una palabra: ")
    val text: String? = readLine()

    if (letter != null && text != null) {
        val result = letter_count(letter, text)
        if (result == 1){
            println("Esta letra se encontró $result vez")
        } else {
            println("Esta letra se encontró $result veces")
        }
       
    } else {
        println("Entrada inválida")
    }
}

fun letter_count(letter: Char, text: String): Int {
    var count = 0
    for (char in text) {
        if (char == letter){
            count++
        }
    }
    return count
}


