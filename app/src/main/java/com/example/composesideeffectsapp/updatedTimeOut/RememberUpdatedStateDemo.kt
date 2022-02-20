package com.example.composesideeffectsapp.updatedTimeOut

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import kotlinx.coroutines.delay

@Composable
fun RememberUpdatedStateDemo(
    onTimeOut: () -> Unit
) {
    val updatedOnTimeOut by rememberUpdatedState(newValue = onTimeOut)
    LaunchedEffect(key1 = true) {
        delay(1000L)
        updatedOnTimeOut()
    }
}