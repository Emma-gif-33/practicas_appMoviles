package practica1

fun main(array: Array<String>) {
    var suma: Int = 0
    val number: Int = readln().toInt()

    for (i in 1..number) {
        suma += i
    }
    println("La suma es $suma")

    var factorial: Int = 1
    var n: Int = 1
    while(n <= number){
        factorial *= n
        n++
    }
    println("Factorial: $factorial")
}