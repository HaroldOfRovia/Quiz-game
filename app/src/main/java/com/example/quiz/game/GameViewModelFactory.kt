package com.example.quiz.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class GameViewModelFactory(private val topicID: Int, private val quizID: Int) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(topicID, quizID) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class.")
    }
}