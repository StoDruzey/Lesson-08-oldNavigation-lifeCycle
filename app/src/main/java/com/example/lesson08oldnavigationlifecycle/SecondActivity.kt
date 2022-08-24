package com.example.lesson08oldnavigationlifecycle

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson08oldnavigationlifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivitySecondBinding.inflate(layoutInflater, null, false)
            .also { setContentView(it.root) }
            .apply {
                editText.setText(intent.getStringExtra("key_text"))

                button.setOnClickListener {
                    setResult(300, Intent().putExtra("key_text", editText.text.toString()))
                    finish()
                }
            }
    }
}