package com.example.composesideeffectsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composesideeffectsapp.ui.theme.ComposeSideEffectsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSideEffectsAppTheme {
                var text by remember {
                    mutableStateOf("Hello")
                }
                LaunchedEffect(key1 = text) {
                    // this is launched every time when the state of key1 changes
                    // this is also a coroutine scope
                    println("show $text")
                }
                Button(onClick = {
                    text += "#"
                }) {
                    Text(text = text)
                }
            }
        }
    }
}

