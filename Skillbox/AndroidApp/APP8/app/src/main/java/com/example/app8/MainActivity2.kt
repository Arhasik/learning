//package com.example.app8
//
//import android.content.Intent
//import android.os.Build
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.example.app8.databinding.ActivityMain2Binding
//import com.example.app8.databinding.ActivityMainBinding
//
//class MainActivity2 : AppCompatActivity() {
//    private lateinit var binding: ActivityMain2Binding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        binding = ActivityMain2Binding.inflate(layoutInflater)
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(binding.root)
//
//       var bundle = intent.extras
//        val text1 = bundle?.getString("EXTRA_STRING_FIRST")
//        val text2: WordList = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            bundle?.getSerializable("EXTRA_STRING_SECOND",WordList::class.java) as WordList
//        } else {
//            bundle?.getSerializable("EXTRA_STRING_SECOND") as WordList
//        }
//
//
////        var text2:WordList = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
////            intent.getSerializableExtra("EXTRA_STRING_SECOND",WordList::class.java) as WordList
////        } else {
////            intent.getStringExtra("EXTRA_STRING_SECOND") as WordList
////        }
//
//
//        with(binding){
//            btnBack.setOnClickListener {
//                val intent = Intent(this@MainActivity2, MainActivity::class.java)
//                startActivity(intent)
//            }
//        }
//        binding.textView2.text = text1
//        binding.textView3.text = text2.word
//
//    }
//}