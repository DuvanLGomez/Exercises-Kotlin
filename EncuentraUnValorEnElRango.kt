fun main() {
    print("Ingresa un número: ")
    var input = readLine()

    if (input != null) {
        var num = input.toInt()
        if (num in 50..100){
            println("Bingo!")
            println("Hemos encontrado el numero: $num")
        } else {
             println("No hemos encontrado el numero: $num")
        }
       
    } else {
        println("Entrada inválida")
    }
}