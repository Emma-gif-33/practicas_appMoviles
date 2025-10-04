import kotlin.math.sqrt

class Raices( val a: Double, val b: Double, val c: Double ) {

    fun getDiscriminante(): Double {
        var result:Double
        result = (b * b) - (4 * a * c)
        return result
    }

    fun tieneRaices(): Boolean {
        return getDiscriminante() > 0.0
    }

    fun tieneRaiz(): Boolean {
        return getDiscriminante() == 0.0
    }

    private fun obtenerRaices() {
        val discriminante = getDiscriminante()

        val r1 = (-b + sqrt(discriminante)) / (2 * a)
        val r2 = (-b - sqrt(discriminante)) / (2 * a)
        println("Resultado 1: $r1")
        println("Resultado 2: $r2")
    }

    private fun obtenerRaiz() {
        val resultado = -b / (2 * a)
        println("Resultado: $resultado")
    }

    fun calcular() {
        if (tieneRaices()){
            println("La ecuación tiene dos soluciones:")
            obtenerRaices()
        }else if (tieneRaiz()){
            println("La ecuación tiene una única solución:")
            obtenerRaiz()
        }else{
            println("no tiene raíz.")
        }
    }
}

fun main() {
    println("Introduce el valor de a:")
    val a = readln().toDouble()
    println("Introduce el valor de b:")
    val b = readln().toDouble()
    println("Introduce el valor de  c:")
    val c = readln().toDouble()

    val ecuacion = Raices(a, b, c)
    ecuacion.calcular()
}