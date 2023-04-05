package com.example.quiz.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import com.example.quiz.Quizzes
import com.example.quiz.R
import java.lang.StringBuilder
import kotlin.math.roundToInt


class QuizAdapter(
    context: Context, resource: Int,
    private val topicID: Int,
    viewLifecycleOwner: LifecycleOwner
) :
    ArrayAdapter<Quizzes.Quiz>(context, resource, Quizzes.topics[topicID].quizzes) {
    private var inflater: LayoutInflater? = null
    private var layout: Int = resource
    private var viewLifecycleOwner : LifecycleOwner

    init {
        this.viewLifecycleOwner = viewLifecycleOwner
        this.inflater = LayoutInflater.from(context)
    }

    @SuppressLint("ViewHolder")
    override fun getView(quizID: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = inflater!!.inflate(this.layout, parent, false)
        val name = view.findViewById(R.id.name) as TextView
        val percent = view.findViewById(R.id.percent) as TextView

        val quiz = Quizzes.topics[topicID].quizzes[quizID]

        name.text = quiz.name

        Quizzes.topics[topicID].quizzes[quizID].progress.observe(viewLifecycleOwner) { progress ->
            percent.text = progress
        }

        return view
    }
}