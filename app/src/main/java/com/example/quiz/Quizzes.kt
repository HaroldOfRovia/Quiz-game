package com.example.quiz

import kotlin.math.roundToInt

class Quizzes {

    data class QuizTopic(
        val name: String,
        val quizzes: List<Quiz>
    )

    data class Quiz(
        val name: String,
        var solved: Int,
        val questions: List<Question>
    )

    data class Question(
        val text: String,
        val answers: List<String>
    )

    val topics: List<QuizTopic> = listOf(
        QuizTopic(
            "Тестовые", listOf(
                Quiz(
                    "Тестовый 1", 8, listOf(
                        Question("0?", listOf("0", "111", "222", "333")),
                        Question("1?", listOf("1", "111", "222", "333")),
                        Question("2?", listOf("2", "111", "222", "333")),
                        Question("3?", listOf("3", "111", "222", "333")),
                        Question("4?", listOf("4", "111", "222", "333")),
                        Question("5?", listOf("5", "111", "222", "333")),
                        Question("6?", listOf("6", "111", "222", "333")),
                        Question("7?", listOf("7", "111", "222", "333")),
                        Question("8?", listOf("8", "111", "222", "333")),
                        Question("9?", listOf("9", "111", "222", "333"))
                    )
                ),
                Quiz(
                    "Тестовый 2", 2, listOf(
                        Question("10?", listOf("10", "qwe", "asd", "zxc")),
                        Question("11?", listOf("11", "qwe", "asd", "zxc")),
                        Question("12?", listOf("12", "qwe", "asd", "zxc")),
                        Question("13?", listOf("13", "qwe", "asd", "zxc")),
                        Question("14?", listOf("14", "qwe", "asd", "zxc")),
                        Question("15?", listOf("15", "qwe", "asd", "zxc")),
                        Question("16?", listOf("16", "qwe", "asd", "zxc")),
                        Question("17?", listOf("17", "qwe", "asd", "zxc")),
                        Question("18?", listOf("18", "qwe", "asd", "zxc")),
                        Question("19?", listOf("19", "qwe", "asd", "zxc"))
                    )
                )
            )
        ),
        QuizTopic(
            "Математика", listOf(
                Quiz(
                    "Тестовый 01", 10, listOf(
                        Question("0?", listOf("0", "111", "222", "333")),
                        Question("1?", listOf("1", "111", "222", "333")),
                        Question("2?", listOf("2", "111", "222", "333")),
                        Question("3?", listOf("3", "111", "222", "333")),
                        Question("4?", listOf("4", "111", "222", "333")),
                        Question("5?", listOf("5", "111", "222", "333")),
                        Question("6?", listOf("6", "111", "222", "333")),
                        Question("7?", listOf("7", "111", "222", "333")),
                        Question("8?", listOf("8", "111", "222", "333")),
                        Question("9?", listOf("9", "111", "222", "333"))
                    )
                ),
                Quiz(
                    "Тестовый 02", 3, listOf(
                        Question("10?", listOf("10", "qwe", "asd", "zxc")),
                        Question("11?", listOf("11", "qwe", "asd", "zxc")),
                        Question("12?", listOf("12", "qwe", "asd", "zxc")),
                        Question("13?", listOf("13", "qwe", "asd", "zxc")),
                        Question("14?", listOf("14", "qwe", "asd", "zxc")),
                        Question("15?", listOf("15", "qwe", "asd", "zxc")),
                        Question("16?", listOf("16", "qwe", "asd", "zxc")),
                        Question("17?", listOf("17", "qwe", "asd", "zxc")),
                        Question("18?", listOf("18", "qwe", "asd", "zxc")),
                        Question("19?", listOf("19", "qwe", "asd", "zxc"))
                    )
                )
            )
        )
    )

    fun getTopic(index: Int): QuizTopic {
        return topics[index]
    }

    fun getTopicProgress(index: Int): Int {
        var solved = 0F
        var questionCount = 0F
        topics[index].quizzes.forEach {
            solved += it.solved
            questionCount += it.questions.size
        }
        return (solved / questionCount * 100).roundToInt()
    }

    fun getGlobalProgress(): Int {
        var solved = 0F
        var questionCount = 0F
        topics.forEach { topic ->
            topic.quizzes.forEach {
                solved += it.solved
                questionCount += it.questions.size
            }
        }
        return (solved / questionCount * 100).roundToInt()
    }
}