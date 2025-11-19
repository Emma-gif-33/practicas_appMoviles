package com.luisperez.scores_unidad3.ui.viewModels

import androidx.navigation.NavController
import com.luisperez.scores_unidad3.domain.model.Student

class ViewModel(navController: NavController) {
    var studentsA = listOf<Student>(
        Student(1, "a", "a-a", 1, 'A', 75.1),
        Student(2, "b", "b-b", 1, 'A', 40.5),
        Student(3, "c", "c-c", 1, 'A', 10.2)
    )

    //PRUEBA SOLAMENTE!!!!!!!!!
    //SE SUPONE QUE AL TENER LA VISTA DE ADD STUDENT ESTO CAMBIARÍA.

    fun getScoresA() {
        var scoreSum: Double = 0.0
        val average: Double

        if (studentsA.isNullOrEmpty()) {
            println("No hay estudiantes en la lista")
        } else {
            for (student in studentsA) {
                scoreSum += student.score
            }
            average = scoreSum / studentsA.size
            println("Promedio general: $average")
        }
    } //wtf sería lo mismo para cada lista(?)

    fun minAverage() {
        var mAverage = studentsA.sortedBy { it.score }
        mAverage.take(3)
        println(mAverage)
    }

    fun maxAverage(){
        var gAverage = studentsA.sortedByDescending { it.score }
        gAverage.take(3)
        println(gAverage)
    }

    //sortedByDescending = mayor a menor
    //sortedBy = menor a mayor
}