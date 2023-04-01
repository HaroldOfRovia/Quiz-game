package com.example.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.quiz.databinding.FragmentGameEndBinding


class GameEndFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentGameEndBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_end, container, false
        )
        if (!requireArguments().getBoolean("win"))
            binding.result.text = "Вы проиграли!"
        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_gameEndFragment_to_titleFragment)
        }
        return binding.root
    }
}