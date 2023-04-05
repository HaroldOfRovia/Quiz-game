package com.example.quiz

import androidx.lifecycle.MutableLiveData
import kotlin.math.roundToInt


class Quizzes {

    data class QuizTopic(
        val name: String,
        val progress: MutableLiveData<String>,
        val quizzes: List<Quiz>
    )

    data class Quiz constructor(
        val name: String,
        val progress: MutableLiveData<String>,
        val questions: List<Question>
    ) {
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
        var globalProgress = MutableLiveData("0%")

        val topics: List<QuizTopic> = listOf(
            QuizTopic(
                "Тесты", MutableLiveData("0%"), listOf(
                    Quiz(
                        "Тест 1", MutableLiveData("0%"), listOf(
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 1", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 2", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 3", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 4", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 5", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 6", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 7", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 8", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 9", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 1\"", false, listOf("ответ 10", "не ответ", "не ответ", "не ответ")))
                    ),
                    Quiz(
                        "Тест 2", MutableLiveData("0%"), listOf(
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 1", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 2", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 3", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 4", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 5", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 6", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 7", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 8", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 9", "не ответ", "не ответ", "не ответ")),
                        Question("Это очень сложный вопрос в теме \"Тест 2\"", false, listOf("ответ 10", "не ответ", "не ответ", "не ответ")))
                    )
                )
            ),
            QuizTopic(
                "Математика", MutableLiveData("0%"), listOf(
                    Quiz(
                        "Сложение", MutableLiveData("0%"), listOf(
                        Question("Сколько будет 32+89?", false, listOf("121", "120", "124", "118")),
                        Question("Сколько будет 100+42?", false, listOf("142", "143", "141", "138")),
                        Question("Сколько будет 27+18?", false, listOf("45", "47", "56", "43")),
                        Question("Сколько будет 57+80?", false, listOf("137", "138", "139", "135")),
                        Question("Сколько будет 71+34?", false, listOf("105", "100", "110", "115")),
                        Question("Сколько будет 70+55?", false, listOf("125", "120", "115", "130")),
                        Question("Сколько будет 2+76?", false, listOf("78", "80", "76", "77")),
                        Question("Сколько будет 77+16?", false, listOf("93", "90", "95", "99")),
                        Question("Сколько будет 45+3?", false, listOf("48", "50", "46", "47")),
                        Question("Сколько будет 89+57?", false, listOf("146", "144", "143", "150")))
                    ),
                    Quiz(
                        "Вычетание", MutableLiveData("0%"), listOf(
                        Question("Сколько будет 32-89?", false, listOf("-57", "-60", "-58", "59")),
                        Question("Сколько будет 100-42?", false, listOf("58", "60", "59", "57")),
                        Question("Сколько будет 27-18?", false, listOf("9", "10", "8", "7")),
                        Question("Сколько будет 57-80?", false, listOf("-23", "-22", "-21", "-20")),
                        Question("Сколько будет 71-34?", false, listOf("37", "38", "34", "35")),
                        Question("Сколько будет 70-55?", false, listOf("15", "20", "10", "2")),
                        Question("Сколько будет 2-76?", false, listOf("-74", "-80", "-76", "-77")),
                        Question("Сколько будет 77-16?", false, listOf("61", "60", "65", "69")),
                        Question("Сколько будет 45-3?", false, listOf("42", "40", "46", "47")),
                        Question("Сколько будет 89-57?", false, listOf("32", "34", "33", "30")))
                    ),
                    Quiz(
                        "Умножение", MutableLiveData("0%"), listOf(
                        Question("Сколько будет 2х2?", false, listOf("4", "2", "6", "5")),
                        Question("Сколько будет 3х2?", false, listOf("6", "5", "4", "9")),
                        Question("Сколько будет 5х3?", false, listOf("15", "10", "12", "20")),
                        Question("Сколько будет 1х3?", false, listOf("3", "2", "1", "5")),
                        Question("Сколько будет 9х5?", false, listOf("45", "50", "49", "40")),
                        Question("Сколько будет 6х6?", false, listOf("36", "35", "30", "38")),
                        Question("Сколько будет 6х7?", false, listOf("42", "40", "38", "44")),
                        Question("Сколько будет 3х8?", false, listOf("24", "25", "22", "30")),
                        Question("Сколько будет 6х8?", false, listOf("48", "44", "50", "49")),
                        Question("Сколько будет 5х5?", false, listOf("25", "26", "23", "10")))
                    ),
                    Quiz(
                        "Деление", MutableLiveData("0%"), listOf(
                        Question("Сколько будет 4/2?", false, listOf("2", "1", "3", "4")),
                        Question("Сколько будет 6/3?", false, listOf("2", "1", "3", "4")),
                        Question("Сколько будет 15/5?", false, listOf("3", "4", "2", "5")),
                        Question("Сколько будет 3/3?", false, listOf("1", "2", "3", "4")),
                        Question("Сколько будет 45/9?", false, listOf("5", "6", "7", "4")),
                        Question("Сколько будет 36/6?", false, listOf("6", "4", "5", "7")),
                        Question("Сколько будет 42/7?", false, listOf("6", "3", "4", "5")),
                        Question("Сколько будет 24/3?", false, listOf("8", "9", "6", "7")),
                        Question("Сколько будет 48/8?", false, listOf("6", "3", "4", "5")),
                        Question("Сколько будет 25/5?", false, listOf("5", "6", "4", "3")))
                    )
                )
            ),
            QuizTopic(
                "История", MutableLiveData("0%"), listOf(
                    Quiz("Вторая мировая война", MutableLiveData("0%"), listOf(
                        Question("В каком году Италия объявила войну Великобритании и Франции?", false, listOf("1940", "1941", "1938", "1937")),
                        Question("Когда произошел ввод советских войск в Эстонию, Латвию и Литву?", false, listOf("1940", "1941", "1938", "1937")),
                        Question("Когда произошла капитуляция Варшавы?", false, listOf("1939", "1940", "1941", "1937")),
                        Question("Когда началась советско-финляндская война?", false, listOf("1939", "1940", "1941", "1937")),
                        Question("Когда произошло вторжение германских войск в Данию и Норвегию?", false, listOf("1940", "1941", "1938", "1937")),
                        Question("Когда Эстония, Латвия и Литва входят в состав СССР.?", false, listOf("1940", "1941", "1938", "1937")),
                        Question("Когда произошло начало советского контрнаступления под Москвой?", false, listOf("1941", "1940", "1938", "1937")),
                        Question("Когда Германия и Италия объявляют войну США?", false, listOf("1941", "1940", "1938", "1937")),
                        Question("Когда нацисты приняли план истребления всех евреев Европы?", false, listOf("1942", "1940", "1938", "1941")),
                        Question("Начало германского наступления на Сталинград и Кавказ?", false, listOf("1942", "1940", "1938", "1941")))
                    ),
                    Quiz("Первая мировая война", MutableLiveData("0%"), listOf(
                        Question("В каком году произошло свержение монархии в России?", false, listOf("1917", "1918", "1915", "1913")),
                        Question("Когда произошел геноцид армян?", false, listOf("1915", "1918", "1914", "1913")),
                        Question("Когда произошла битва при Ипре?", false, listOf("1915", "1918", "1914", "1913")),
                        Question("Когда Германия объявила войну России?", false, listOf("1914", "1918", "1915", "1913")),
                        Question("Когда произошл брусиловский прорыв?", false, listOf("1916", "1918", "1915", "1914")),
                        Question("Когда вступлила в войну США?", false, listOf("1917", "1918", "1915", "1916")),
                        Question("Когда произошла Октябрьская революция?", false, listOf("1917", "1918", "1915", "1916")),
                        Question("Когда произошло контрнаступление Антанты?", false, listOf("1918", "1917", "1915", "1916")),
                        Question("Когда произошла капитуляция Османской империи?", false, listOf("1918", "1917", "1915", "1916")),
                        Question("Когда был подписан Версальский мир?", false, listOf("1919", "1917", "1918", "1916")))
                    ),
                    Quiz("Столетняя война", MutableLiveData("0%"), listOf(
                        Question("Начало Столетней войны:", false, listOf("1337 ", "1338", "1336", "1334")),
                        Question("Уничтожение французского флота в морской битве при Слейсе:", false, listOf("1340 ", "1338", "1337", "1341")),
                        Question("Поражение французской армии в битве при Креси:", false, listOf("1346 ", "1343", "1344", "1345")),
                        Question("Поражение французов в битве при Пуатье:", false, listOf("1356", "1353", "1358", "1355")),
                        Question("Заключение мира в Бретиньи:", false, listOf("1360", "1356", "1359", "1358")),
                        Question("Заключение второго перемирия между Англией и Францией:", false, listOf("1396", "1398", "1400", "1397")),
                        Question("Высадка английского десанта в материковой Европе:", false, listOf("1415", "1414", "1416", "1417")),
                        Question("Битва при Краване:", false, listOf("1423", "1422", "1424", "1425")),
                        Question("Начала осады Орлеана англичанами:", false, listOf("1428", "1430", "1429", "1427")),
                        Question("Битва при Кастийоне:", false, listOf("1453", "1454", "1455", "1452")))
                    ),
                    Quiz("Советский союз", MutableLiveData("0%"), listOf(
                        Question("Голод в советской России:", false, listOf("1921 ", "1923", "1919", "1924")),
                        Question("Создание СССР:", false, listOf("1922", "1923", "1925", "1917")),
                        Question("Принятие Конституции СССР:", false, listOf("1924", "1922", "1926", "1925")),
                        Question("И.В. Сталин во главе СССР:", false, listOf("1924", "1922", "1926", "1925")),
                        Question("Первая пятилетка:", false, listOf("1928", "1930", "1933", "1926")),
                        Question("Голод в СССР:", false, listOf("1932", "1928", "1930", "1933")),
                        Question("Начало «холодной войны»:", false, listOf("1946", "1945", "1949", "1947")),
                        Question("Денежная реформа", false, listOf("1947", "1946", "1945", "1949")),
                        Question("Суэцкий кризис:", false, listOf("1956", "1954", "1958", "1960")),
                        Question("Карибский кризис:", false, listOf("1962", "1966", "1956", "1968")))
                    )
                )
            )
        )


        fun setTopicProgress() {
            topics.forEach { topic ->
                var solved = 0F
                var questionCount = 0F
                topic.quizzes.forEach { quiz ->
                    questionCount += quiz.questions.size
                    solved += quiz.getCountSolved()

                }
                topic.progress.value = (solved / questionCount * 100).roundToInt().toString() + "%"
            }
        }

        fun setQuizProgress() {
            topics.forEach { topic ->
                topic.quizzes.forEach { quiz ->
                    val solved = quiz.getCountSolved()
                    var questionCount = quiz.questions.size
                    quiz.progress.value =
                        (solved / questionCount * 100).roundToInt().toString() + "%"
                }
            }

        }

        fun setGlobalProgress() {
            var solved = 0F
            var questionCount = 0F
            topics.forEach { topic ->
                topic.quizzes.forEach { quiz ->
                    questionCount += quiz.questions.size
                    solved += quiz.getCountSolved()

                }
            }
            globalProgress.value = (solved / questionCount * 100).roundToInt().toString() + "%"
        }
    }
}