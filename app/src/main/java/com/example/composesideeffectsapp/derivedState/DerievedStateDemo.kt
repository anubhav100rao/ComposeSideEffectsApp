package com.example.composesideeffectsapp.derivedState

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun DerivedStateDemo() {
    var counter by remember {
        mutableStateOf(0)
    }
    val counterState by derivedStateOf {
        "The counter is $counter"
    }
    Button(onClick = {
        counter++
    }) {
        Text(text = counterState)
    }
}