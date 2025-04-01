package com.example.app7

import android.animation.Animator
import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewAnimationUtils
import android.view.ViewGroup
import com.example.app7.databinding.FragmentSecondBinding
import kotlin.math.hypot

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_START_X = "startX"
private const val ARG_START_Y = "startY"

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Устанавливаем анимацию возврата
        returnTransition = TransitionInflater.from(requireContext())
            .inflateTransition(android.R.transition.move)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val startX = arguments?.getInt(ARG_START_X) ?: 0
        val startY = arguments?.getInt(ARG_START_Y) ?: 0

        binding.root.visibility = View.INVISIBLE
        binding.root.post {
            if (isAdded && !isDetached) { // Проверяем, что фрагмент прикреплён
                val finalRadius = hypot(
                    binding.root.width.toDouble(),
                    binding.root.height.toDouble()
                ).toFloat()

                val animator: Animator = ViewAnimationUtils.createCircularReveal(
                    binding.root, startX, startY, 0f, finalRadius
                )
                animator.duration = 500
                binding.root.visibility = View.VISIBLE
                animator.start()
            }
        }
    }

    override fun onDestroyView() {
        // Проверяем, что представление всё ещё прикреплено перед запуском анимации
        _binding?.let { binding ->
            if (binding.root.isAttachedToWindow) {
                val startX = arguments?.getInt(ARG_START_X) ?: 0
                val startY = arguments?.getInt(ARG_START_Y) ?: 0
                val finalRadius = hypot(binding.root.width.toDouble(), binding.root.height.toDouble()).toFloat()

                val animator = ViewAnimationUtils.createCircularReveal(
                    binding.root, startX, startY, finalRadius, 0f
                )
                animator.duration = 300
                animator.start()
            }
        }

        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(startX: Int, startY: Int, param1: String, param2: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_START_X, startX)
                    putInt(ARG_START_Y, startY)
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}