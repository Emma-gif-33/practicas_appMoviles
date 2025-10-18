package com.example.practice_2.presentation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.navigation.NavController
import com.example.practice_2.data.Student

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController){
    var students = listOf<Student>(
        Student(1, "Persona 1", "Esta es una descripción", "link*"),
        Student(2, "Persona 2", "Esta otra es descripción", "l"),
        Student(3, "Persona 3", "Es otra esta descripción", "l"),
        Student(4, "Persona 4", "Descripción esta otra es", "l"),
        Student(5, "Persona 5", "Descripción", "l")
    )
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Dasboard")
                }
            )
        }
    ) {
        Content(it, students, navController)
    }
}


@Composable
fun Content(paddingValues: PaddingValues, student: List<Student>, navController: NavController){
    LazyColumn(
        modifier = Modifier
            .padding(paddingValues).padding(horizontal = 10.dp)
    ) {
        items(student){ student ->
            Box(
                modifier = Modifier
                    .clickable{
                        navController.navigate("Details/${student.id}")
                    }
                    .size(90.dp)
                    .background(color = Color.LightGray, CircleShape)
                    .wrapContentSize(Alignment.Center)
                    .padding(10.dp)
            ){
                Text(student.name)
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}