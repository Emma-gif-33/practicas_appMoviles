package com.example.coroutine_practice.Presentation.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.coroutine_practice.Presentation.navigation.CoroutineViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Details")
                },
                actions = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "")
                    }
                }
            )
        }
    ){
        DetailsContent(it, viewModel())
    }
}

@Composable
fun DetailsContent(paddingValues: PaddingValues, viewModel: CoroutineViewModel){
    Column( modifier = Modifier
        .padding(paddingValues)
    ){
        Button( onClick = { viewModel.callToApi() }
        ) {
            Text("Evento 1")
        }
        if (viewModel.action1.value.isNotEmpty()){
            Text(viewModel.action1.value)
        }
        Spacer(modifier = Modifier)

        Button( onClick = { viewModel.secondCall()}
        ) {
            Text("Evento 2")
        }
        if (viewModel.action2.value.isNotEmpty()){
            Text(viewModel.action2.value)
        }
        Spacer(modifier = Modifier)

        Button( onClick = { viewModel.idkJustFinishThis() }
        ) {
            Text("Evento 3")
        }
        if (viewModel.action3.value.isNotEmpty()){
            Text(viewModel.action3.value)
        }
        var color by remember { mutableStateOf(false) }
        Button( onClick = { color = !color },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (color) Color.Yellow else Color.Blue
            )) {
            Text("¡Pícame!")
        }
    }
}