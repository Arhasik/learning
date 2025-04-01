package com.example.app7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.transition.TransitionInflater
import androidx.fragment.app.commit
import com.example.app7.databinding.FragmentFirstBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FirstFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Устанавливаем анимацию выхода для FirstFragment
        exitTransition = TransitionInflater.from(requireContext())
            .inflateTransition(android.R.transition.move)

        binding.nextButton.setOnClickListener {
            // Создаём SecondFragment
            val secondFragment = SecondFragment()

            // Устанавливаем анимацию входа для SecondFragment
            secondFragment.enterTransition = TransitionInflater.from(requireContext())
                .inflateTransition(android.R.transition.move)

            // Получаем координаты кнопки для передачи в SecondFragment
            val buttonLocation = IntArray(2)
            binding.nextButton.getLocationOnScreen(buttonLocation)
            val startX = buttonLocation[0] + binding.nextButton.width / 2
            val startY = buttonLocation[1] + binding.nextButton.height / 2

            // Передаём координаты через Bundle с правильными ключами
            val bundle = Bundle().apply {
                putInt("startX", startX) // Совпадает с SecondFragment
                putInt("startY", startY) // Совпадает с SecondFragment
            }
            secondFragment.arguments = bundle

            // Настраиваем shared element (если есть)
            val sharedElement = binding.sharedImage
            val transitionName = sharedElement.transitionName

            // Выполняем переход
            requireActivity().supportFragmentManager.commit {
                setReorderingAllowed(true) // Разрешаем реорганизацию для анимаций
                addSharedElement(sharedElement, transitionName) // Shared element transition
                replace(R.id.fragmentContainer, secondFragment)
                addToBackStack("FirstFragment") // Добавляем в стек возврата
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}