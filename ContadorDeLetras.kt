fun main(args: Array<String>) {
    println("Ingrasa una letra: ")
    val letter: Char? = readLine()?.get(0)
    println("Ingrasa una palabra: ")
    val text: String? = readLine()

    if (letter != null && text != null) {
        val result = letter_count(letter, text)
        if (result == 1){
            println("Esta leta se encontó $result vez")
        } else {
            println("Esta leta se encontó $result veces")
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


