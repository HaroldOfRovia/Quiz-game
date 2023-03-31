package com.example.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.quiz.databinding.FragmentGameBinding


class GameFragment : Fragment() {
    private lateinit var questions: MutableList<Quizzes.Question>
    private var numberQuestion: Int = 0
    private var questionIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentGameBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game, container, false)


        val topicID = requireArguments().getInt("topicID")
        val quizID = requireArguments().getInt("quizID")
        val quiz = Quizzes.topics[topicID].quizzes[quizID]
        questions = quiz.questions.toMutableList()
        questions.shuffle()
        numberQuestion = questions.size - 1

        binding.quizName.text = quiz.name
        if (questionIndex < numberQuestion)
            binding.question.text = questions[questionIndex].text
        val answerButtons = listOf(binding.answerBtn1,
            binding.answerBtn2, binding.answerBtn3, binding.answerBtn4,)

        setQuestion(answerButtons)
        answerButtons.forEach{ btn ->
            btn.setOnClickListener{
                if (btn.text == questions[questionIndex].answers[0] && questionIndex < numberQuestion) {
                    questions[questionIndex].solved = true
                    questionIndex++
                    binding.question.text = questions[questionIndex].text
                    setQuestion(answerButtons)
                    binding.invalidateAll()
                }
                else {
                    val bundle = Bundle()
                    if (questionIndex >= numberQuestion)
                        bundle.putBoolean("win", true)
                    else
                        bundle.putBoolean("win", false)
                    findNavController().navigate(R.id.action_gameFragment_to_gameEndFragment, bundle)
                }
            }
        }


        return binding.root
    }

    private fun setQuestion(answerButtons: List<Button>) {
        val answers : MutableList<String> = questions[questionIndex].answers.toMutableList()
        answers.shuffle()
        for(i in 0 until answers.size){
            answerButtons[i].text = answers[i]
        }
    }
}