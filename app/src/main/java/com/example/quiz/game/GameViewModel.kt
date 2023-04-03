package com.example.quiz.game

import androidx.lifecycle.ViewModel
import com.example.quiz.model.Quizzes

class GameViewModel : ViewModel() {

    var topicID: Int = 0
    var quizID: Int = 0
    private lateinit var quiz: Quizzes.Quiz
    private lateinit var questions: MutableList<Quizzes.Question>
    private var numberQuestion = 0
    private var questionIndex = 0

    init {
        getShuffledList()
    }

    fun getShuffledList() {
        quiz = Quizzes.topics[topicID].quizzes[quizID]
        questions = quiz.questions.toMutableList()
        questions.shuffle()
        numberQuestion = questions.size - 1
    }

    fun getQuizName(): String {
        return quiz.name
    }

    fun getQuestionText() : String {
        return questions[questionIndex].text
    }

    fun getShuffledAnswers(): MutableList<String> {
        val answers = questions[questionIndex].answers.toMutableList()
        answers.shuffle()
        return answers
    }

    fun getAnswer() : String {
        return questions[questionIndex].answers[0]
    }

    fun allQuestionIsSolved() : Boolean {
        return questionIndex >= numberQuestion
    }

    fun answerCorrect() {
        questions[questionIndex].solved = true
        questionIndex++
    }
}