package com.example.examen_practice.Presentation.Views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.examen_practice.Presentation.Navigation.StoreDarkMode
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModesView(navController: NavController, darkModeStore: StoreDarkMode){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Mode")
                },
                actions = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(imageVector =  Icons.AutoMirrored.Default.ArrowBack, contentDescription = "")
                    }
                }
            )
        }
    ){
        ModesContent(it, darkModeStore)
    }
}

@Composable
fun ModesContent(paddingValues: PaddingValues, darkModeStore: StoreDarkMode){
    val scope = rememberCoroutineScope()
    Column(modifier = Modifier
        .padding(paddingValues)
    ){
        Button( onClick = {
            scope.launch{
                darkModeStore.saveDarkMode(false)
            }
        }) {
            Text("Cambiar a modo claro")
        }
        Spacer(modifier = Modifier)

        Button( onClick = {
            scope.launch {
                darkModeStore.saveDarkMode(true)
            }
        }) {
            Text("Cambiar a modo oscuro")
        }
    }
}