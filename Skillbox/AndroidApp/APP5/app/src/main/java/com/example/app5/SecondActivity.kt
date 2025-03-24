package com.example.app5

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app5.databinding.Activity1Binding
import com.google.android.material.snackbar.Snackbar

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: Activity1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val hasPatronymic = intent.getBooleanExtra(PersonInputLauncher.EXTRA_HAS_PATRONYMIC, false)

        if (hasPatronymic) {
            binding.patronymic.visibility = android.view.View.VISIBLE
        } else {
            binding.patronymic.visibility = android.view.View.GONE
        }

        binding.save.setOnClickListener {
            val firstName = binding.textFirstName.text.toString()
            val lastName = binding.textLastName.text.toString()
            val patronymic = if (hasPatronymic) binding.textPatronymic.text.toString() else null

            if (hasPatronymic) {
                if (lastName.isEmpty() || firstName.isEmpty() || patronymic?.isEmpty() ?: true) {
                    Snackbar.make(binding.root, "Заполните все поля", Snackbar.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            } else {
                if (lastName.isEmpty() || firstName.isEmpty()) {
                    Snackbar.make(binding.root, "Заполните все поля", Snackbar.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            }

            val person = Person(lastName, firstName, patronymic)
            val resultIntent = Intent().putExtra(PersonInputLauncher.EXTRA_PERSON_RESULT, person)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}