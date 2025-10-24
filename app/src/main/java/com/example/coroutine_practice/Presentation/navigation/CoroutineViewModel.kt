package com.example.coroutine_practice.Presentation.navigation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class CoroutineViewModel: ViewModel() {
    val event1 = mutableStateOf(true)
    val action1 = mutableStateOf("")

    val event2 = mutableStateOf(true)
    val action2 = mutableStateOf("")

    val event3 = mutableStateOf(true)
    val action3 = mutableStateOf("")


    fun callToApi(){
        viewModelScope.launch{
            doForBtnOne()
        }
    }
    suspend fun doForBtnOne(){
        event1.value = false
        action1.value = withContext(Dispatchers.IO) {
            kotlinx.coroutines.delay(5_000)
            "Holi"
        }
    }

    fun secondCall(){
        viewModelScope.launch{
            doForBtnTwo()
        }
    }
    suspend fun doForBtnTwo(){
        event2.value = false
        action2.value = withContext(Dispatchers.IO) {
            kotlinx.coroutines.delay(5_000)
            ":3"
        }
    }

    fun idkJustFinishThis(){
        viewModelScope.launch{
            doForBtnThree()
        }
    }
    suspend fun doForBtnThree(){
        event3.value = false
        action3.value = withContext(Dispatchers.IO) {
            kotlinx.coroutines.delay(5_000)
            "Texto"
        }
    }
}