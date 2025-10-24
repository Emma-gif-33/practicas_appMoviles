package com.example.coroutine_practice.Presentation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.coroutine_practice.Presentation.navigation.CoroutineViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Dasboard")
                }
            )
        }
    ){
        Content(it, navController)
    }
}


@Composable
fun Content(paddingValues: PaddingValues, navController: NavController){
    Column( modifier = Modifier
        .padding(paddingValues)
    ){
        Box(
            modifier = Modifier
                .clickable {
                    navController.navigate("Details")
                }
                .size(100.dp)
                .background(color = Color.LightGray, CircleShape)
                .wrapContentSize(Alignment.Center)
                .padding(10.dp)
        ){
            Text("Click aquí")
        }
    }
}