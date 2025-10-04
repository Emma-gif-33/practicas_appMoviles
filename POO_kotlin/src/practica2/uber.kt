package practica2

fun main(array: Array<String>) {
    println("Ingresa la distancia del conductor (km): ")
    var distance: Double = readLine()!!.toDouble()
    println("El conductor está disponible (1  = si/ 0 = no)")
    var access: Int = readLine()!!.toInt()
    var defAccess: Boolean = true
    if (access==1){
        defAccess=true
    }else{
        defAccess=false
    }

    if (distance <= 0.5 && defAccess == true) {
        println("Listo para iniciar recorrido")
    }else if (distance <= 0.5 && defAccess == false) {
        println("Conductor cercano, pero no disponible")
    }else if (distance > 0.5 && defAccess == true) {
        print("Conductor disponible pero muy lejos, se aplicarán tarifas muy altas")
    }else if (distance > 0.5 && defAccess == false) {
        println("No hay conductores disponibles")
    }
}