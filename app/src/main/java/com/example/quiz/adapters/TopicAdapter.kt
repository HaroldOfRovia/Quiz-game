package com.example.quiz.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.quiz.model.Quizzes
import com.example.quiz.R
import java.lang.StringBuilder


class TopicAdapter(context: Context, resource: Int) :
    ArrayAdapter<Quizzes.QuizTopic>(context, resource, Quizzes.topics) {
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

        name.text = Quizzes.topics[index].name

        val str = StringBuilder()
        str.append(Quizzes.getTopicProgress(index).toString()).append("%")
        percent.text = str.toString()

        return view
    }
}