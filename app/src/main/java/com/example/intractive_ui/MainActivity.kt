package com.example.intractive_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.intractive_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) 
        // For Dark button to enable dark mode
        binding.btnDarkMode.setOnClickListener(){
            // when Dark button get clicked then  background will be change to dark mode
           binding.newlayout.setBackgroundResource(R.color.black)
            // and the text change to white in color
            binding.textView.setTextColor(getColor(R.color.white))
        }
        // For Read button to enable Read mode
        binding.btnReadMode.setOnClickListener(){
            binding.newlayout.setBackgroundResource(R.color.warm)
            binding.textView.setTextColor(getColor(R.color.black))
        }

    }
}