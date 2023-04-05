package com.example.quiz.end

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quiz.database.QuestionProgressDao

class GameEndModelFactory(
    private val dao: QuestionProgressDao?,
    private val application: Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameEndViewModel::class.java)) {
            return GameEndViewModel(dao, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class.")
    }
}