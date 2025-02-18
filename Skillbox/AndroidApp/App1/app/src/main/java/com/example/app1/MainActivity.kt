package com.example.app1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.databinding.ActivityMainBinding


class MainActivity: AppCompatActivity() { // класс главного экрана
    private lateinit var binding: ActivityMainBinding
    val bus = Bus()
    override fun onCreate(savedInstanceState: Bundle?) {  // метод вызываемый при создании экрана одна из ключевыйх точек входа в жизненый цикл экрана, выполняет первичную инициализацию
        // bundle это специальный контейнер для хранения данных. Он используется для передачи данных между компонентами приложения и сохранения информации при изменни состояния activity
        // savedInstanseState - это объект bundle который позволяет сохранить и восстановить данные активности при её создании. например если устройство повернуть, уничтожается текущий экран и создаётся новый
        super.onCreate(savedInstanceState) // вызываем метод родителя чтобы сохранить состояние
//        setContentView(R.layout.activity_main) // устанавливаем разметку экрана, свзяывает код с xml файлами разметки
//        var button: TextView = findViewById(R.id.Evgeniy)
//        button.setOnClickListener {  }
        binding = ActivityMainBinding.inflate(layoutInflater) // Создаём объект binding, который связывает код с XML


        setContentView(binding.root)// Устанавливаем разметку через binding

        updateUI()


        binding.buttonPlus.setOnClickListener {
            bus.addPassenger()
            updateUI()
        }

        binding.buttonMinus.setOnClickListener {
            bus.removePassenger()
            updateUI()
        }

        binding.buttonReset.setOnClickListener {
            bus.resetBus()
            updateUI()
        }



    }

    private fun updateUI() {
        val seats = bus.getPassengerCount()
        val textCenter = resources.getStringArray(R.array.textCentre)

        binding.counter.text = "$seats"
        when {
            seats == 0 -> {
                binding.textCounter.text = "${textCenter[0]} - ${10 - seats}"
                binding.textCounter.setTextColor(Color.GREEN)
                binding.buttonMinus.isEnabled = false
                binding.buttonPlus.isEnabled = true
                binding.buttonReset.visibility = View.INVISIBLE
            }
            seats in 1..9 -> {
                binding.textCounter.text = "${textCenter[1]} - ${10 - seats}"
                binding.textCounter.setTextColor(Color.BLUE)
                binding.buttonPlus.isEnabled = true
                binding.buttonMinus.isEnabled = true
                binding.buttonReset.visibility = View.INVISIBLE
            }
            seats == 10 -> {
                binding.textCounter.text = "${textCenter[2]} - ${10 - seats}"
                binding.textCounter.setTextColor(Color.RED)
                binding.buttonPlus.isEnabled = false
                binding.buttonReset.visibility = View.VISIBLE
            }
        }
    }
}

