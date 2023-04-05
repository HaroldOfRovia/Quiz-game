package com.example.quiz.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.example.quiz.Quizzes
import com.example.quiz.R
import java.lang.StringBuilder


class TopicAdapter(context: Context, resource: Int, viewLifecycleOwner: LifecycleOwner) :
    ArrayAdapter<Quizzes.QuizTopic>(context, resource, Quizzes.topics) {
    private var inflater: LayoutInflater? = null
    private var layout: Int = resource
    private var viewLifecycleOwner : LifecycleOwner

    init {
        this.viewLifecycleOwner = viewLifecycleOwner
        this.inflater = LayoutInflater.from(context)
    }

    @SuppressLint("ViewHolder")
    override fun getView(index: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = inflater!!.inflate(this.layout, parent, false)
        val name = view.findViewById(R.id.name) as TextView
        val percent = view.findViewById(R.id.percent) as TextView

        name.text = Quizzes.topics[index].name

        Quizzes.topics[index].progress.observe(viewLifecycleOwner) { progress ->
            percent.text = progress
        }

        return view
    }
}