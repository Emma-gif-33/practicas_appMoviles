package com.luisperez.scores_unidad3.ui.views

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.luisperez.scores_unidad3.domain.model.Student
import com.luisperez.scores_unidad3.ui.viewModels.ViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Average(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Promedio general por grupo")
                }
            )
        }
    ) {
        AverageContent(it, navController)
    }
}

@Composable
fun AverageContent(
    paddingValues: PaddingValues,
    navController: NavController,
){
    LazyColumn (
        modifier = Modifier
            .padding(10.dp)
            .padding(paddingValues)
    ){

    }
}