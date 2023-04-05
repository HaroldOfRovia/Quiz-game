package com.example.quiz.end

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.quiz.Quizzes
import com.example.quiz.database.QuestionProgress
import com.example.quiz.database.QuestionProgressDao
import kotlinx.coroutines.*

class GameEndViewModel(val dao: QuestionProgressDao?, application: Application) :
    AndroidViewModel(application) {

    private var viewModelJob = Job()
    private var uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    fun saveProgress() {
        uiScope.launch {
            for (topicId in Quizzes.topics.indices) {
                for (quizId in Quizzes.topics[topicId].quizzes.indices) {
                    for (questionId in Quizzes.topics[topicId].quizzes[quizId].questions.indices) {
                        if (Quizzes.topics[topicId].quizzes[quizId].questions[questionId].solved) {
                            withContext(Dispatchers.IO) {
                                dao?.insert(
                                    QuestionProgress(
                                        topicId = topicId,
                                        quizId = quizId,
                                        questionId = questionId
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}