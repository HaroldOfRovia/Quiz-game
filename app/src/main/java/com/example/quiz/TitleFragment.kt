package com.example.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.example.quiz.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)  : View? {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)

        val quizzes = Quizzes()
        val quizAdapter = QuizAdapter(requireContext(), R.layout.list_item, quizzes)

        val listView: ListView = binding.quizzesList
        listView.adapter = quizAdapter

        return binding.root
    }
}