package com.example.quiz

class Quizzes {

    data class Quiz(
        val name: String,
        var progress: Number,
        val questions: List<Question>
    )

    data class Question(
        val text: String,
        val answers: List<String>
    )

    val quizzes: List<Quiz> = listOf(
        Quiz(
            "Тестовый 1", 0, listOf(
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
            "Тестовый 2", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 3", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 4", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 5", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 6", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 7", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 8", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 9", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 10", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 11", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 12", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 13", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 14", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 15", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 16", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 17", 20, listOf(
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
        ),
        Quiz(
            "Тестовый 18", 20, listOf(
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

    fun get(index: Int): Quiz {
        return quizzes[index]
    }

    fun getQuizzesNames(): MutableList<String> {
        val names: MutableList<String> = mutableListOf()
        quizzes.forEach {
            names.add(it.name)
        }
        return names
    }

    fun getQuizByName(name: String): Quiz {
        var quiz = quizzes[0]
        quizzes.forEach {
            if (it.name == name)
                quiz = it
        }
        return quiz
    }
}