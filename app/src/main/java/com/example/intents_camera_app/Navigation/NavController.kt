package com.example.intents_camera_app.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.intents_camera_app.ViewModel.CameraViewModel
import com.example.intents_camera_app.Views.CameraView
import com.example.intents_camera_app.Views.HomeView

@Composable
fun NavController() {
    val navController = rememberNavController()
    val sharedViewModel: CameraViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeView(
                viewModel = sharedViewModel,
                onPhotoTaken = {
                    navController.navigate("camera")
                }
            )
        }
        composable("camera") {
            CameraView(
                viewModel = sharedViewModel,
                onRetakeRequested = {
                    navController.popBackStack()
                }
            )
        }
    }
}