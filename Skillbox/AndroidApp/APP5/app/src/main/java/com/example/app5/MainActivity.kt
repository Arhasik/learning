package com.example.app5

import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.app5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var withPatronymic = false

    private val personInputLauncher = registerForActivityResult(PersonInputLauncher()) { person ->
        if (person != null) {
            val fullName = "${person.lastName} ${person.firstName}" +
                    (person.patronymic?.let { " $it" } ?: "")
            binding.resultText.text = fullName
        } else {
            Toast.makeText(this, "Данные не получены", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switching.setOnClickListener {
            // Запускаем SecondActivity с текущим значением withPatronymic
            personInputLauncher.launch(withPatronymic)

            // Переключаем состояние и обновляем текст кнопки
            withPatronymic = !withPatronymic
        }
    }
}