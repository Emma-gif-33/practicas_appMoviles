package com.example.intents_camera_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.intents_camera_app.Navigation.NavController
import com.example.intents_camera_app.ViewModel.CameraViewModel
import com.example.intents_camera_app.Views.CameraView
import com.example.intents_camera_app.Views.HomeView
import com.example.intents_camera_app.ui.theme.Intents_camera_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Intents_camera_appTheme {
                NavController()
            }
        }
    }
}