package com.example.app3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var isPlaying = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.play.setOnClickListener {
            if (isPlaying) {
                binding.play.setImageResource(R.drawable.play_circle_24px)
            } else {
                binding.play.setImageResource(R.drawable.pause_circle_24px)
            }
            isPlaying = !isPlaying
        }

        binding.firstTextView.text ="The Beatles"
        binding.secondTextView.text = "Let it Be"


    }

}

