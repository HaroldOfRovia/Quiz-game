package com.example.quiz.title

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.quiz.Quizzes
import com.example.quiz.database.QuestionProgress
import com.example.quiz.database.QuestionProgressDao
import kotlinx.coroutines.*

class TitleViewModel(private val dao: QuestionProgressDao?, application: Application) :
    AndroidViewModel(application) {

    private var viewModelJob = Job()
    private var uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    init {
        initSolved()
    }

    private fun initSolved() {
        uiScope.launch {
            val list : List<QuestionProgress>? = withContext(Dispatchers.IO) {
                return@withContext dao?.getAll()
            }

            if (list?.isEmpty() == false) {
                list.forEach {
                    Quizzes.topics[it.topicId].quizzes[it.quizId].questions[it.questionId].solved =
                        it.solved
                }
            }
            Quizzes.setTopicProgress()
            Quizzes.setQuizProgress()
            Quizzes.setGlobalProgress()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}