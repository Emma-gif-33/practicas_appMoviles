package com.luisperez.scores_unidad3.ui.viewModels

import androidx.navigation.NavController
import com.luisperez.scores_unidad3.domain.model.Student

class ViewModel(navController: NavController) {
    var studentsA = listOf<Student>(
        Student(1, "a", "a-a", 1, 'A', 75.1),
        Student(2, "b", "b-b", 1, 'A', 40.5),
        Student(3, "c", "c-c", 1, 'A', 10.2)
    )

    //ESTAS DOS LISTAS SON DE PRUEBA SOLAMENTE!!!!!!!!!
    //SE SUPONE QUE AL TENER LA VISTA DE ADD STUDENT ESTO CAMBIARÍA.
    var studentsB = listOf<Student>(
        Student(1, "a", "a-a", 9, 'B', 50.2),
        Student(2, "b", "b-b", 9, 'B', 99.9),
        Student(3, "c", "c-c", 9, 'B', 83.7)
    )

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
        studentsA.sor
    }

    //sortedByDescending = mayor a menor
    //sortBy = menor a mayor
}