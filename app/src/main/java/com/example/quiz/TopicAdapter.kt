package com.example.quiz

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.lang.StringBuilder


class TopicAdapter(context: Context, resource: Int, private var topics: Quizzes) :
    ArrayAdapter<Quizzes.QuizTopic>(context, resource, topics.topics) {
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

        val topic = topics.getTopic(index)

        name.text = topic.name

        val str = StringBuilder()
        str.append(topics.getTopicProgress(index).toString()).append("%")
        percent.text = str.toString()

        return view
    }
}