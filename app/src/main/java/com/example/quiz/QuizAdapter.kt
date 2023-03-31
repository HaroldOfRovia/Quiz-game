package com.example.quiz

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.lang.StringBuilder
import kotlin.math.roundToInt


class QuizAdapter(
    context: Context, resource: Int, private var quizzes: Quizzes,
    private val topicId: Int
) :
    ArrayAdapter<Quizzes.Quiz>(context, resource, quizzes.getTopic(topicId).quizzes) {
    private var inflater: LayoutInflater? = null
    private var layout: Int = resource

    init {
        this.inflater = LayoutInflater.from(context)
    }

    @SuppressLint("ViewHolder")
    override fun getView(index: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = inflater!!.inflate(this.layout, parent, false)
        val name = view.findViewById(R.id.name) as TextView
        val percent = view.findViewById(R.id.percent) as TextView

        val quiz = quizzes.getTopic(topicId).quizzes[index]

        name.text = quiz.name

        val str = StringBuilder()
        str.append(
            (quiz.getCountSolved() / quiz.questions.size * 100)
                .roundToInt().toString()
        ).append("%")
        percent.text = str.toString()

        return view
    }
}