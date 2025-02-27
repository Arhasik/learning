package com.example.app2

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.app2.databinding.CustomViewBinding

class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {



       private var binding: CustomViewBinding = CustomViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.PostView,
            0, 0
        ).apply {
            try {
                val topText = getString(R.styleable.PostView_topText) ?: ""
                val bottomText = getString(R.styleable.PostView_bottomText) ?: ""
                setPostText(topText, bottomText)
            } finally {
                recycle()
            }
        }
    }

    fun setPostText(upper: String, lower: String) {
        binding.upperText.text = upper
        binding.lowerText.text = lower
    }


}
