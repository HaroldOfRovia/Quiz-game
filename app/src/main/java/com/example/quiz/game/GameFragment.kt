package com.example.quiz.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.quiz.R
import com.example.quiz.databinding.FragmentGameBinding


class GameFragment : Fragment() {

    private lateinit var viewModel: GameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentGameBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game, container, false
        )

        viewModel = ViewModelProvider(this)[GameViewModel::class.java]
        viewModel.topicID = requireArguments().getInt("topicID")
        viewModel.quizID = requireArguments().getInt("quizID")
        viewModel.getShuffledList()

        binding.quizName.text = viewModel.getQuizName()
        binding.question.text = viewModel.getQuestionText()

        val answerButtons = listOf(
            binding.answerBtn1, binding.answerBtn2,
            binding.answerBtn3, binding.answerBtn4
        )

        setQuestion(answerButtons)
        answerButtons.forEach { btn ->
            btn.setOnClickListener {
                if (btn.text == viewModel.getAnswer() && !viewModel.allQuestionIsSolved()) {
                    viewModel.answerCorrect()
                    binding.question.text = viewModel.getQuestionText()
                    setQuestion(answerButtons)
                } else {
                    val bundle = Bundle()
                    if (viewModel.allQuestionIsSolved()) {
                        bundle.putBoolean("win", true)
                        viewModel.answerCorrect()
                    } else
                        bundle.putBoolean("win", false)
                    findNavController().navigate(
                        R.id.action_gameFragment_to_gameEndFragment,
                        bundle
                    )
                }
            }
        }
        return binding.root
    }


    private fun setQuestion(answerButtons: List<Button>) {
        val answers : MutableList<String> = viewModel.getShuffledAnswers()
        for (i in 0 until answers.size) {
            answerButtons[i].text = answers[i]
        }
    }
}