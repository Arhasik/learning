package com.example.app5

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
class PersonInputLauncher: ActivityResultContract<Boolean, Person?>() {

    override fun createIntent(context: Context, input: Boolean): Intent {
        return Intent(context, SecondActivity::class.java).apply {
            putExtra(EXTRA_HAS_PATRONYMIC, input)
        }
    }


    companion object {
        const val EXTRA_HAS_PATRONYMIC = "com.example.app5.HAS_PATRONYMIC"
        const val EXTRA_PERSON_RESULT = "com.example.app5.PERSON_RESULT"
    }
    @Suppress("DEPRECATION")
    override fun parseResult(resultCode: Int, intent: Intent?): Person? {
        if (resultCode != Activity.RESULT_OK || intent == null) return null
        return intent.getParcelableExtra(EXTRA_PERSON_RESULT) as? Person
    }
}

