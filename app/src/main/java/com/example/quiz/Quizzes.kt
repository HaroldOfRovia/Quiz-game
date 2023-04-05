package com.example.quiz

import com.example.quiz.database.QuestionProgress
import com.example.quiz.database.QuestionProgressDao
import kotlin.math.roundToInt


class Quizzes {

    data class QuizTopic(
        val name: String,
        val language: String,
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

    companion object {
        val topics: List<QuizTopic> = listOf(
            QuizTopic(
                "Тесты", "ru", listOf(
                    Quiz(
                        "Тест 1", listOf(
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 1", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 2", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 3", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 4", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 5", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 6", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 7", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 8", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 9", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 1\"",
                                false,
                                listOf("ответ 10", "не ответ", "не ответ", "не ответ")
                            )
                        )
                    ),
                    Quiz(
                        "Тест 2", listOf(
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 1", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 2", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 3", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 4", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 5", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 6", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 7", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 8", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 9", "не ответ", "не ответ", "не ответ")
                            ),
                            Question(
                                "Это очень сложный вопрос в теме \"Тест 2\"",
                                false,
                                listOf("ответ 10", "не ответ", "не ответ", "не ответ")
                            )
                        )
                    )
                )
            ),
            QuizTopic(
                "Математика", "ru", listOf(
                    Quiz(
                        "Сложение", listOf(
                            Question(
                                "Сколько будет 32+89?",
                                false,
                                listOf("121", "120", "124", "118")
                            ),
                            Question(
                                "Сколько будет 100+42?",
                                false,
                                listOf("142", "143", "141", "138")
                            ),
                            Question("Сколько будет 27+18?", false, listOf("45", "47", "56", "43")),
                            Question(
                                "Сколько будет 57+80?",
                                false,
                                listOf("137", "138", "139", "135")
                            ),
                            Question(
                                "Сколько будет 71+34?",
                                false,
                                listOf("105", "100", "110", "115")
                            ),
                            Question(
                                "Сколько будет 70+55?",
                                false,
                                listOf("125", "120", "115", "130")
                            ),
                            Question("Сколько будет 2+76?", false, listOf("78", "80", "76", "77")),
                            Question("Сколько будет 77+16?", false, listOf("93", "90", "95", "99")),
                            Question("Сколько будет 45+3?", false, listOf("48", "50", "46", "47")),
                            Question(
                                "Сколько будет 89+57?",
                                false,
                                listOf("146", "144", "143", "150")
                            )
                        )
                    ),
                    Quiz(
                        "Вычетание", listOf(
                            Question(
                                "Сколько будет 32-89?",
                                false,
                                listOf("-57", "-60", "-58", "59")
                            ),
                            Question(
                                "Сколько будет 100-42?",
                                false,
                                listOf("58", "60", "59", "57")
                            ),
                            Question("Сколько будет 27-18?", false, listOf("9", "10", "8", "7")),
                            Question(
                                "Сколько будет 57-80?",
                                false,
                                listOf("-23", "-22", "-21", "-20")
                            ),
                            Question("Сколько будет 71-34?", false, listOf("37", "38", "34", "35")),
                            Question("Сколько будет 70-55?", false, listOf("15", "20", "10", "2")),
                            Question(
                                "Сколько будет 2-76?",
                                false,
                                listOf("-74", "-80", "-76", "-77")
                            ),
                            Question("Сколько будет 77-16?", false, listOf("61", "60", "65", "69")),
                            Question("Сколько будет 45-3?", false, listOf("42", "40", "46", "47")),
                            Question("Сколько будет 89-57?", false, listOf("32", "34", "33", "30"))
                        )
                    ),
                    Quiz(
                        "Умножение", listOf(
                            Question("Сколько будет 2х2?", false, listOf("4", "2", "6", "5")),
                            Question("Сколько будет 3х2?", false, listOf("6", "5", "4", "9")),
                            Question("Сколько будет 5х3?", false, listOf("15", "10", "12", "20")),
                            Question("Сколько будет 1х3?", false, listOf("3", "2", "1", "5")),
                            Question("Сколько будет 9х5?", false, listOf("45", "50", "49", "40")),
                            Question("Сколько будет 6х6?", false, listOf("36", "35", "30", "38")),
                            Question("Сколько будет 6х7?", false, listOf("42", "40", "38", "44")),
                            Question("Сколько будет 3х8?", false, listOf("24", "25", "22", "30")),
                            Question("Сколько будет 6х8?", false, listOf("48", "44", "50", "49")),
                            Question("Сколько будет 5х5?", false, listOf("25", "26", "23", "10"))
                        )
                    ),
                    Quiz(
                        "Деление", listOf(
                            Question("Сколько будет 4/2?", false, listOf("2", "1", "3", "4")),
                            Question("Сколько будет 6/3?", false, listOf("2", "1", "3", "4")),
                            Question("Сколько будет 15/5?", false, listOf("3", "4", "2", "5")),
                            Question("Сколько будет 3/3?", false, listOf("1", "2", "3", "4")),
                            Question("Сколько будет 45/9?", false, listOf("5", "6", "7", "4")),
                            Question("Сколько будет 36/6?", false, listOf("6", "4", "5", "7")),
                            Question("Сколько будет 42/7?", false, listOf("6", "3", "4", "5")),
                            Question("Сколько будет 24/3?", false, listOf("8", "9", "6", "7")),
                            Question("Сколько будет 48/8?", false, listOf("6", "3", "4", "5")),
                            Question("Сколько будет 25/5?", false, listOf("5", "6", "4", "3"))
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