package com.example.android.q1_set_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import com.example.android.q1_set_b.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding:ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioButtonOne.setOnClickListener {
            Toast.makeText(this,"Radio Button One clciked",Toast.LENGTH_SHORT).show()
        }

        binding.radioButtonTwo.setOnClickListener {
            Toast.makeText(this,"Radio Button Two clciked",Toast.LENGTH_SHORT).show()
        }

        binding.radioButtonThree.setOnClickListener {
            Toast.makeText(this,"Radio Button Three clciked",Toast.LENGTH_SHORT).show()
        }

        binding.button.setOnClickListener {
            var display = binding.editText.text
            Toast.makeText(this,"Entered $display",Toast.LENGTH_SHORT).show()
        }

        binding.checkbox.setOnClickListener {
            if (binding.checkbox.isChecked)
            { Toast.makeText(this,"Checked ${binding.checkbox.text}",Toast.LENGTH_SHORT).show()}
            else
            {Toast.makeText(this,"Unchecked ${binding.checkbox.text}",Toast.LENGTH_SHORT).show()}
        }
    }
}