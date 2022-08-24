package com.example.lesson08oldnavigationlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.lesson08oldnavigationlifecycle.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    private val activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        if (it.resultCode == 300) {
            requireNotNull(binding).textView.text = it.data?.getStringExtra("key_text")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* val binding = */ActivityMainBinding.inflate(layoutInflater, null, false)
            .also {
                setContentView(it.root)
                binding = it
            }
            .apply {
                textView.setOnClickListener {
                    val intent = Intent(this@MainActivity, SecondActivity::class.java)
                        .putExtra("key_text", textView.text)
                    activityLauncher.launch(intent)
//                    this@MainActivity.startActivity(intent) //delete startActivity. Use activityLauncher
                }
            }
        /*setContentView(binding.root)
        with(binding) {
            button.setOnClickListener {
            }
         */
    }
}