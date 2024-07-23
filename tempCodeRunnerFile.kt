
fun main(args: Array<String>) {
    input ()
    val price = readLine ()?.toDoubleOrNull()
    if (price != null) {
        calc(price)
    } else {
        println("Entrada no válida. Por favor, ingresa un número.")
    }
}
fun calc (x : Double) {
    println (x + x * 0.15)
}
fun input (){
    println("Ingresa un precio para calcular valor con impuestos: ")
}