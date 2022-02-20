package com.example.composesideeffectsapp.launchedEffect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.flow.collect

@Composable
fun LaunchedEffectFlowDemo(
    viewModel: LaunchedEffectViewModel = LaunchedEffectViewModel()
) {
    LaunchedEffect(key1 = true) {
        // this key1 = true means to execute only once when it is composed
        viewModel.sharedFlow.collect { event ->
            when(event) {
                is LaunchedEffectViewModel.ScreenEvents.ShowSnackBar -> {

                }
                is LaunchedEffectViewModel.ScreenEvents.Navigate -> {

                }
            }
        }
    }
}