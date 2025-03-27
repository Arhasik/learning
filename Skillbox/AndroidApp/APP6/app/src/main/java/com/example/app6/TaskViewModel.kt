package com.example.app6

import androidx.lifecycle.ViewModel

class TaskViewModel:ViewModel() {
    val tasks = mutableListOf<String>()
}