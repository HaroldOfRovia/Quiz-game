package com.example.quiz.title

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.quiz.Quizzes
import com.example.quiz.R
import com.example.quiz.adapters.QuizAdapter
import com.example.quiz.adapters.TopicAdapter
import com.example.quiz.database.ProgressDatabase
import com.example.quiz.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    private lateinit var viewModel: TitleViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false
        )

        val application = requireActivity().application
        val dao = ProgressDatabase.getInstance(application)?.getQuestionProgressDao()
        val viewModelFactory = TitleModelFactory(dao, application)
        viewModel = ViewModelProvider(this, viewModelFactory)[TitleViewModel::class.java]

        val listView: ListView = binding.topicList

        Quizzes.globalProgress.observe(viewLifecycleOwner) { progress ->
            binding.globalProgress.text = getString(R.string.global_progress) + " " + progress
        }

        val topicAdapter = TopicAdapter(requireContext(), R.layout.list_item, viewLifecycleOwner)
        listView.adapter = topicAdapter

        val itemListener = OnItemClickListener { _, _, topicPosition, _ ->
            val quizAdapter = QuizAdapter(
                requireContext(), R.layout.list_item, topicPosition, viewLifecycleOwner
            )
            listView.adapter = quizAdapter

            val quizListener = OnItemClickListener { _, _, quizPosition, _ ->
                val bundle = Bundle()
                bundle.putInt("topicID", topicPosition)
                bundle.putInt("quizID", quizPosition)
                findNavController().navigate(R.id.action_titleFragment_to_gameFragment, bundle)
            }

            listView.onItemClickListener = quizListener
            binding.globalProgress.visibility = View.INVISIBLE

            val callback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    findNavController().navigate(R.id.action_titleFragment_self)
                }
            }
            requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
        }
        listView.onItemClickListener = itemListener

        return binding.root
    }
}