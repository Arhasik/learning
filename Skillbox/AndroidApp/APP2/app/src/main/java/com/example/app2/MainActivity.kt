package com.example.app2

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app2.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.customView.setPostText(
            "Верхняя строчка, настроенная из кода",
            "Нижняя строчка, настроенная из кода"
        )

        }


    }
