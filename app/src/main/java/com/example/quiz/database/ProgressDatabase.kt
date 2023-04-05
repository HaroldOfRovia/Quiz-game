package com.example.quiz.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [QuestionProgress::class], version = 1, exportSchema = false)
abstract class ProgressDatabase : RoomDatabase() {

    companion object {
        @Volatile
        private var INSTANCE: ProgressDatabase? = null

        fun getInstance(context: Context) : ProgressDatabase? {
            synchronized(this) {
                var instance = INSTANCE
                if (INSTANCE == null) {
                    instance = Room.databaseBuilder(context.applicationContext, ProgressDatabase::class.java, "progress_db").build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

    abstract fun getQuestionProgressDao(): QuestionProgressDao
}