package com.example.android.q1_set_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android.q1_set_b.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val binding:ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.logId.setOnClickListener {
            Toast.makeText(this,"Click Detected",Toast.LENGTH_SHORT).show()
        }
        binding.signId.setOnClickListener {
            Toast.makeText(this,"Click Detected",Toast.LENGTH_SHORT).show()
        }
        binding.doneId.setOnClickListener {
            Toast.makeText(this,"Click Detected",Toast.LENGTH_SHORT).show()
        }
    }
}