package com.example.quiz.database

import androidx.room.*


@Dao
interface QuestionProgressDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(q: QuestionProgress)

    @Update
    fun update(q: QuestionProgress)

    @Query("SELECT * FROM question_solved WHERE topicId = :topicId and quizId = :quizId and questionId = :questionId")
    fun get(topicId: Int, quizId: Int, questionId: Int): QuestionProgress

    @Query("SELECT * FROM question_solved")
    fun getAll(): List<QuestionProgress>
}