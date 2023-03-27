package com.example.quiz

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.lang.StringBuilder


class QuizAdapter : ArrayAdapter<Quizzes.Quiz> {
    private var inflater: LayoutInflater? = null
    private var layout: Int
    private var quizzes: Quizzes

    constructor(context: Context, resource: Int, quizzes: Quizzes)
            : super(context, resource, quizzes.quizzes) {
        println("QQQQQQQQQQQQQQQQQQ")
        this.quizzes = quizzes;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @SuppressLint("ViewHolder")
    override fun getView(index: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = inflater!!.inflate(this.layout, parent, false)
        val name = view.findViewById(R.id.quiz_name) as TextView
        val percent = view.findViewById(R.id.percent) as TextView

        val quiz = quizzes.get(index)

        name.text = quiz.name

        val str = StringBuilder()
        str.append(quiz.progress.toString()).append("%")
        percent.text = str.toString()

        return view
    }

//    override fun getCount(): Int {
//        return quizzes.quizzes.size
//    }

//    override fun getView(index: Int, convertView: View?, parent: ViewGroup): View {
//        val view = inflater!!.inflate(layout, parent, false)
//        val name = view.findViewById<TextView>(com.example.quiz.R.id.quiz_name)
//        val percent = view.findViewById<TextView>(com.example.quiz.R.id.percent)
//
//        val quiz = quizzes.get(index)
//
//        name.text = quiz.name
//        percent.text = quiz.progress.toString()
//
//        return view
//    }
}