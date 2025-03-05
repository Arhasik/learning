package com.example.app4

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doOnTextChanged
import com.example.app4.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding  // Объявляем, но не инициализируем сразу

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mySwitch.setOnCheckedChangeListener { _, isChecked ->
            binding.checkBoxFirst.isEnabled = isChecked
            binding.checkBoxSecond.isEnabled = isChecked
        }
        val countBall = Random.nextInt(101)
        binding.countBall.text="$countBall/100"
        binding.linearIndicator.progress = countBall

        binding.mySwitch.setOnCheckedChangeListener { compoundButton, isChecked ->
            binding.checkBoxFirst.isEnabled = isChecked
            binding.checkBoxSecond.isEnabled = isChecked
            updateButtonState()
        }



        binding.textName.doOnTextChanged { text, start, before, count ->
            val textName = text.toString()
            if(!correctEnterName(textName)){
                binding.inputName.error = "Неправильное имя"
            } else binding.inputName.error = null
            updateButtonState()

        }
        binding.textPhone.doOnTextChanged { text, start, before, count ->
            val textPhone = text.toString()

            if(!correctEnterPhone(textPhone)){
                binding.inputPhone.error = "Неправильный номер"
            } else binding.inputPhone.error = null
            updateButtonState()

        }

        binding.checkBoxFirst.setOnCheckedChangeListener { compoundButton, b ->
            updateButtonState()

        }

        binding.checkBoxSecond.setOnCheckedChangeListener { compoundButton, b ->
            updateButtonState()

        }

        binding.button.setOnClickListener {
            if (isAllInputValid()) {
                Snackbar.make(binding.root,"Save information", Snackbar.LENGTH_SHORT).show()
            }
        }



    }

    fun correctEnterName(text:String): Boolean {
        val trimmedName = text.trim()
        if (trimmedName.isEmpty() || trimmedName.length < 2 ||trimmedName.length > 40) {
            return false
        }
        return trimmedName.matches(Regex("^[a-zA-Zа-яА-ЯёЁ\\s-]+$"))
    }

    fun correctEnterPhone(number:String):Boolean {
        val trimmedPhone = number.trim()

        if(trimmedPhone.isEmpty()) {
            return false
        }
        val digitsOnly = trimmedPhone.replace(Regex("[^\\d]"), "")
        if(digitsOnly.length!=11||!trimmedPhone.startsWith("+7")) {
            return false
        }
        return trimmedPhone.matches(Regex("^[+7\\d\\-\\s()]+$"))
    }
    fun isGenderSelected ():Boolean {
        return binding.radioButtonMan.isChecked || binding.radioButtonWomen.isChecked
    }

    fun areNotificationsSelected():Boolean {
        if (!binding.mySwitch.isChecked) {
            return true
        }
        return binding.checkBoxFirst.isChecked || binding.checkBoxSecond.isChecked
    }

    fun isAllInputValid():Boolean {

        val name = binding.textName.text.toString()
        val phone = binding.textPhone.text.toString()

        return correctEnterName(name) &&
                correctEnterPhone(phone) &&
                isGenderSelected() &&
                areNotificationsSelected()
    }


    fun updateButtonState () {
        binding.button.isEnabled = isAllInputValid()

        if (binding.button.isEnabled) {
            Toast.makeText(this, "Все четко сохраняй быстрее", Toast.LENGTH_SHORT).show()
        }


    }
}






