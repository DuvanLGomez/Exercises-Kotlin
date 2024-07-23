fun main() {
    var arr = arrayOf(1,2,6,2,8,9)
    println ("Los numeros pares del arreglo son: ")
    for (x in arr) {
        if (x % 2 != 0)
        continue
        println(x)
    }
    
}