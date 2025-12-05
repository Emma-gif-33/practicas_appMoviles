package com.example.intents_camera_app.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.unit.dp
import com.example.intents_camera_app.ViewModel.CameraViewModel

@Composable
fun CameraView(
    viewModel: CameraViewModel,
    onRetakeRequested: () -> Unit
) {
    val image = viewModel.capturedImage
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (image != null) {
            Image(
                bitmap = image.asImageBitmap(),
                contentDescription = "Foto tomada",
                modifier = Modifier
                    .size(300.dp)
                    .padding(bottom = 16.dp)
            )

            Button(onClick = onRetakeRequested) {
                Text("Tomar otra foto")
            }
        } else {
            Text("Error: No hay imagen")
            Spacer(modifier = Modifier
                .height(16.dp)
            )
            Button(
                onClick = onRetakeRequested
            ) {
                Text("Regresar")
            }
        }
    }
}