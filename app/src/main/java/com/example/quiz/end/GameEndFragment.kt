package com.example.quiz.end

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.quiz.R
import com.example.quiz.database.ProgressDatabase
import com.example.quiz.databinding.FragmentGameEndBinding


class GameEndFragment : Fragment() {

    private lateinit var viewModel: GameEndViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentGameEndBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_end, container, false
        )

        val application = requireActivity().application
        val dao = ProgressDatabase.getInstance(application)?.getQuestionProgressDao()
        val viewModelFactory = GameEndModelFactory(dao, application)
        viewModel = ViewModelProvider(this, viewModelFactory)[GameEndViewModel::class.java]
        viewModel.saveProgress()

        if (!requireArguments().getBoolean("win"))
            binding.result.text = getString(R.string.lose_notice)
        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_gameEndFragment_to_titleFragment)
        }
        return binding.root
    }
}