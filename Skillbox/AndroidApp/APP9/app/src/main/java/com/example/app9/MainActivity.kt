package com.example.app9


import android.icu.util.Calendar
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.app9.databinding.ActivityMainBinding
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.text.SimpleDateFormat
import java.util.TimeZone

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Инициализация
        enableEdgeToEdge()
        setContentView(binding.root)

        val calendar = Calendar.getInstance()
        val dateFormat = SimpleDateFormat("dd-MM-yy:mm")
        val date = calendar.time
        val formatter = dateFormat.format(date)
        dateFormat.timeZone = TimeZone.getTimeZone("Europe/Moscow")
        dateFormat.timeZone = TimeZone.getTimeZone("GTM")
        val formatterDateGTM = dateFormat.format(calendar.time)


        val array: Array<String> = resources.getStringArray(R.array.planets)
        val stringStartsFromM = array.filter { it.startsWith("М") }
//        val intArray: IntArray = resources.getIntArray(R.array.winter_olympic_years)


        val count = resources.getQuantityString(R.plurals.count_new_messages,1,1)

        binding.textView.text = count


        binding.openDatePicker.setOnClickListener {
            val constrains = CalendarConstraints.Builder()
                .setOpenAt(calendar.timeInMillis)
                .build()
            val dateDialog =  MaterialDatePicker.Builder.datePicker()
                .setCalendarConstraints(constrains)
//                .setSelection(calendar.timeInMillis)
                .setTitleText(resources.getString(R.string.choose_the_date_dialog_title))
                .build()
            dateDialog.addOnPositiveButtonClickListener { timeInMillis->
                calendar.timeInMillis = timeInMillis
//                val day = calendar.get(Calendar.DAY_OF_MONTH)
//                val month = calendar.get(Calendar.MONTH)
//                val year = calendar.get(Calendar.YEAR)
//                val text = "$day / $month / $year"
                Snackbar.make(binding.openDatePicker, dateFormat.format(calendar.time), Snackbar.LENGTH_LONG).show()

            }
            dateDialog.show(supportFragmentManager,"DatePicker")

        }



        binding.openTimePicker.setOnClickListener {
            val picker = MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_24H)
                .setTitleText(resources.getString(R.string.choose_the_time_dialog_title))
                .setHour(calendar.get(Calendar.HOUR))
                .setMinute(calendar.get(Calendar.MINUTE))
                .build().apply {
                    addOnPositiveButtonClickListener{
                        calendar.set(Calendar.HOUR,this.hour)
                        calendar.set(Calendar.MINUTE,this.minute)
//                        val time = "${calendar.get(Calendar.HOUR)} : ${calendar.get(Calendar.MINUTE)}"

                        Snackbar.make(binding.openTimePicker,dateFormat.format(calendar.time),Snackbar.LENGTH_LONG).show()
                    }
                }
            picker.show(supportFragmentManager,"TimePicker")

        }
    }
}