package com.example.quiz.model

import kotlin.math.roundToInt


class Quizzes {

    data class QuizTopic(
        val name: String,
        val quizzes: List<Quiz>
    )

    data class Quiz constructor(val name: String, val questions: List<Question>) {
        fun getCountSolved(): Float {
            var solved = 0F
            questions.forEach {
                if (it.solved)
                    solved++
            }
            return solved
        }
    }


    data class Question(
        val text: String,
        var solved: Boolean,
        val answers: List<String>
    )

    //аналог static в java
    companion object {
        val topics: List<QuizTopic> = listOf(
            QuizTopic(
                "Тестовые", listOf(
                    Quiz(
                        "Тестовый 1", listOf(
                            Question("Сколько будет 1+1?", false, listOf("2", "111", "222", "333")),
                            Question("1?", false, listOf("1", "111", "222", "333")),
                            Question("2?", false, listOf("2", "111", "222", "333")),
                            Question("3?", false, listOf("3", "111", "222", "333")),
                            Question("4?", false, listOf("4", "111", "222", "333")),
                            Question("5?", false, listOf("5", "111", "222", "333")),
                            Question("6?", false, listOf("6", "111", "222", "333")),
                            Question("7?", false, listOf("7", "111", "222", "333")),
                            Question("8?", false, listOf("8", "111", "222", "333")),
                            Question("9?", false, listOf("9", "111", "222", "333"))
                        )
                    ),
                    Quiz(
                        "Тестовый 2", listOf(
                            Question("10?", false, listOf("10", "qwe", "asd", "zxc")),
                            Question("11?", false, listOf("11", "qwe", "asd", "zxc")),
                            Question("12?", false, listOf("12", "qwe", "asd", "zxc")),
                            Question("13?", false, listOf("13", "qwe", "asd", "zxc")),
                            Question("14?", false, listOf("14", "qwe", "asd", "zxc")),
                            Question("15?", false, listOf("15", "qwe", "asd", "zxc")),
                            Question("16?", false, listOf("16", "qwe", "asd", "zxc")),
                            Question("17?", false, listOf("17", "qwe", "asd", "zxc")),
                            Question("18?", false, listOf("18", "qwe", "asd", "zxc")),
                            Question("19?", false, listOf("19", "qwe", "asd", "zxc"))
                        )
                    )
                )
            ),
            QuizTopic(
                "Математика", listOf(
                    Quiz(
                        "Тестовый 01", listOf(
                            Question("0?", false, listOf("0", "111", "222", "333")),
                            Question("1?", false, listOf("1", "111", "222", "333")),
                            Question("2?", false, listOf("2", "111", "222", "333")),
                            Question("3?", false, listOf("3", "111", "222", "333")),
                            Question("4?", false, listOf("4", "111", "222", "333")),
                            Question("5?", false, listOf("5", "111", "222", "333")),
                            Question("6?", false, listOf("6", "111", "222", "333")),
                            Question("7?", false, listOf("7", "111", "222", "333")),
                            Question("8?", false, listOf("8", "111", "222", "333")),
                            Question("9?", false, listOf("9", "111", "222", "333"))
                        )
                    ),
                    Quiz(
                        "Тестовый 02", listOf(
                            Question("10?", false, listOf("10", "qwe", "asd", "zxc")),
                            Question("11?", false, listOf("11", "qwe", "asd", "zxc")),
                            Question("12?", false, listOf("12", "qwe", "asd", "zxc")),
                            Question("13?", false, listOf("13", "qwe", "asd", "zxc")),
                            Question("14?", false, listOf("14", "qwe", "asd", "zxc")),
                            Question("15?", false, listOf("15", "qwe", "asd", "zxc")),
                            Question("16?", false, listOf("16", "qwe", "asd", "zxc")),
                            Question("17?", false, listOf("17", "qwe", "asd", "zxc")),
                            Question("18?", false, listOf("18", "qwe", "asd", "zxc")),
                            Question("19?", false, listOf("19", "qwe", "asd", "zxc"))
                        )
                    )
                )
            )
        )

        fun getTopicProgress(index: Int): Int {
            var solved = 0F
            var questionCount = 0F
            topics[index].quizzes.forEach { quiz ->
                questionCount += quiz.questions.size
                solved += quiz.getCountSolved()
            }
            return (solved / questionCount * 100).roundToInt()
        }

        fun getGlobalProgress(): Int {
            var solved = 0F
            var questionCount = 0F
            topics.forEach { topic ->
                topic.quizzes.forEach { quiz ->
                    questionCount += quiz.questions.size
                    solved += quiz.getCountSolved()

                }
            }
            return (solved / questionCount * 100).roundToInt()
        }

        fun getQuiz(topicIndex: Int, quizIndex: Int): Quiz {
            return topics[topicIndex].quizzes[quizIndex]
        }
    }
}