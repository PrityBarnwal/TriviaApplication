package com.coolapps.triviaapp.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.coolapps.triviaapp.screens.component.Questions

@Composable
fun TriviaHome( viewModel : QuestionsViewModel= hiltViewModel()){
    Questions(viewModel)
}
