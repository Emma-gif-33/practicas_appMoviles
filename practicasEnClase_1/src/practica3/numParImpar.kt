package practica3

fun main(array: Array<String>) {
    println("Ingrese un número:")
    var num = readLine()!!.toInt()
    while (num <= 0) {
        println("Ingrese un numero positivo:")
        num = readLine()!!.toInt()
    }
    while (num % 2 != 0) {
        println("Ese numero es impar, escoja otro")
        num = readLine()!!.toInt()
    }
    while(num > 1) {
        num = num - 2
        println(num)
    }
}
