package com.example.quiz.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "question_solved")
data class QuestionProgress(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var topicId: Int = 0,
    var quizId: Int = 0,
    var questionId: Int = 0,
    var solved: Boolean = true
)