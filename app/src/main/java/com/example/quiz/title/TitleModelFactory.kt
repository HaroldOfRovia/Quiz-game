package com.example.quiz.title

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quiz.database.QuestionProgressDao
import com.example.quiz.databinding.FragmentTitleBinding

class TitleModelFactory(
    private val dao: QuestionProgressDao?,
    private val application: Application
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TitleViewModel::class.java)) {
            return TitleViewModel(dao, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class.")
    }
}