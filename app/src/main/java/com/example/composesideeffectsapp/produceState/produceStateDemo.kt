package com.example.composesideeffectsapp.produceState

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

@Composable
fun produceStateDemo(
    countUpTo: Int
): State<Int> {
    return produceState(initialValue = 0) {
        while (value < countUpTo) {
            delay(1000L)
            value++
        }
    }
}

@Composable
fun produceStateDemoDup(
    countUpTo: Int
): State<Int> {
    return flow<Int> { 
        var value = 0
        emit(value)
        while(value < countUpTo) {
            delay(1000L)
            value++
            emit(value)
        }
    }.collectAsState(initial = 0)
}