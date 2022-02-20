package com.example.composesideeffectsapp.sIdeEffect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun SideEffectDemo(counter: Int) {
    SideEffect {
        println("Hello sideEffect")
    }
}