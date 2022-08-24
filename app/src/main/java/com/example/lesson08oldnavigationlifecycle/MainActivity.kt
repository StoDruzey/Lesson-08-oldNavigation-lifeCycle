package com.example.lesson08oldnavigationlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson08oldnavigationlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* val binding = */ActivityMainBinding.inflate(layoutInflater, null, false)
            .also { setContentView(it.root) }
            .apply {
                button.setOnClickListener {
                    val intent = Intent(this@MainActivity, SecondActivity::class.java)
                    this@MainActivity.startActivity(intent)
                }
            }
        /*setContentView(binding.root)
        with(binding) {
            button.setOnClickListener {
            }
         */
    }
}