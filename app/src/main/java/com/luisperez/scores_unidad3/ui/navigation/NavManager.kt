package com.luisperez.scores_unidad3.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.luisperez.scores_unidad3.ui.views.AddStudent
import com.luisperez.scores_unidad3.ui.views.DashboardView
import com.luisperez.scores_unidad3.ui.views.EditStudentView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination ="Home"
    ) {
        composable("Home") { DashboardView() }
        composable("Edit-Student") { EditStudentView() }
        composable("Add-Student") { AddStudent() }
    }
}