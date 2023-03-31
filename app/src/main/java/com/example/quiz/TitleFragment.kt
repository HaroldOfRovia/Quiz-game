package com.example.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.quiz.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?)  : View {

        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)
        var itsTopic = true
        val quizzes = Quizzes()
        val listView: ListView = binding.topicList


        binding.globalProgress.append(quizzes.getGlobalProgress().toString())
        binding.globalProgress.append("%")

        val topicAdapter = TopicAdapter(requireContext(), R.layout.list_item, quizzes)
        listView.adapter = topicAdapter
        val itemListener = OnItemClickListener { _, _, topicPosition, _ ->
            itsTopic = !itsTopic
            val quizAdapter = QuizAdapter(requireContext(), R.layout.list_item,
                quizzes, topicPosition)
            listView.adapter = quizAdapter

            val quizListener = OnItemClickListener { _, _, quizPosition, _ ->
                val bundle = Bundle()
                bundle.putInt("topicID", topicPosition)
                bundle.putInt("quizID", quizPosition)
                findNavController().navigate(R.id.action_titleFragment_to_gameFragment, bundle)
            }
            listView.onItemClickListener = quizListener

            binding.globalProgress.visibility = View.INVISIBLE


            val callback = object : OnBackPressedCallback(true){
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