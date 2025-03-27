package com.example.app6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.app6.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val viewModel: TaskViewModel by activityViewModels()


    private val tasks = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState?.getStringArrayList("tasks")?.let{
            tasks.addAll(it)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getString("new_task")?.let { task ->
            if (!tasks.contains(task)) { // Добавляем только уникальные задачи
                tasks.add(task)
                Log.d("FirstFragment", "Добавлена новая задача: $task")
            }
            arguments = null // Очищаем arguments после обработки
        }
        updateTaskList()
        Log.d("FirstFragment", "Список задач: $tasks")

        binding.addTaskButtonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArrayList("tasks", ArrayList(tasks))
        Log.d("FirstFragment", "Сохранено задач: ${tasks.size}")
    }

    private fun updateTaskList() {
        val newText = if (viewModel.tasks.isEmpty()) {
            "Список задач пуст"
        } else {
            viewModel.tasks.joinToString("\n")
        }
        binding.taskListTextviewFirst.text = newText
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}