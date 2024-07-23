fun main() {
    // Solicitar datos por consola
    print("Ingresa un número: ")
    var input = readLine()
    
    if (input != null) {
        var num = input.toInt()
        var sum = 0
        
        while (num > 0) {
            sum += num % 10
            num = num / 10
        }
        
        println("La suma de los dígitos es: $sum")
    } else {
        println("Entrada inválida")
    }
}