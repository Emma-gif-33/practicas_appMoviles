package com.example.intents_camera_app.ViewModel

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class CameraViewModel : ViewModel() {
    var capturedImage by mutableStateOf<Bitmap?>(null)
        private set

    fun onImageCaptured(bitmap: Bitmap?) {
        capturedImage = bitmap
    }
}