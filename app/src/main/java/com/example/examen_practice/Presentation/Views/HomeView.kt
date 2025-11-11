package com.example.examen_practice.Presentation.Views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dagger.hilt.android.HiltAndroidApp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Dashboard")
                }
            )
        }
    ){
        Content(it, navController)
    }
}

@Composable
fun Content(paddingValues: PaddingValues, navController: NavController){
    Column(modifier = Modifier
        .padding(paddingValues)
        .padding(10.dp)
    ){
        Box(
          modifier = Modifier
              .clickable{
                  navController.navigate("Mode")
              }
              .size(105.dp)
              .background(color = Color.Yellow, CircleShape)
              .wrapContentSize(Alignment.Center)
              .padding(20.dp)
        ){
            Text("Cambiar modo")
        }
        Spacer(modifier = Modifier)

        Box(
            modifier = Modifier
                .clickable{
                    navController.navigate("Formulary")
                }
                .size(105.dp)
                .background(color = Color.Yellow, CircleShape)
                .wrapContentSize(Alignment.Center)
                .padding(10.dp)
        ){
            Text("Formulario")
        }

    }
}