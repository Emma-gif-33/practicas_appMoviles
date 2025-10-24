package com.example.coroutine_practice.Presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.coroutine_practice.Presentation.views.DetailsView
import com.example.coroutine_practice.Presentation.views.HomeView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination  = "Home"
    ){
        composable("Home"){
            HomeView(navController)
        }
        composable("Details"){
            DetailsView(navController)
        }
    }
}