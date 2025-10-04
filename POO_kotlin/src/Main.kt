fun main(args: Array<String>) {
//            Ejercicio muestra
    val pocion: Int = 100
    println("Ingresa los miligramos por favor:")
    val miligramos: Int = readLine()!!.toInt()
    if (miligramos == pocion) {
        println("¡Felicidades, es una buena poción multijugos!")
    } else {
        println("La poción es mediocre, sangre sucia inmunda")
    }
}