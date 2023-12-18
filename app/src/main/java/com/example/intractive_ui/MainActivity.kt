package com.example.intractive_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Writing the Functionality of the buttons
        val DarkButton = findViewById<Button>(R.id.btnDarkMode)
        val ReadModeButton = findViewById<Button>(R.id.btnReadMode)
        
        // Taking an instance of layout bcz we have to enable dark and read mode within a layout
        val layout = findViewById<LinearLayout>(R.id.newlayout)

        // Taking a TextField to change the color of text while doing dark and read mode
        val textfield1 = findViewById<TextView>(R.id.textView)

        // For Dark button to enable dark mode
        DarkButton.setOnClickListener(){
            // when Dark button get clicked then  background will be change to dark mode
            layout.setBackgroundResource(R.color.black)
            // and the text change to white in color
            textfield1.setTextColor(getColor(R.color.white))
        }
        // For Read button to enable Read mode
        ReadModeButton.setOnClickListener(){
            layout.setBackgroundResource(R.color.warm)
            textfield1.setTextColor(getColor(R.color.black))
        }

    }
}