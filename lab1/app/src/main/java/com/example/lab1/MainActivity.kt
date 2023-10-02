package com.example.lab1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChangeText = findViewById<Button>(R.id.btnChangeText)
        val btnChangeColor = findViewById<Button>(R.id.btnChangeColor)

        btnChangeText.setOnClickListener {
            val textView = findViewById<TextView>(R.id.tvmain)
            textView.text = "Button Clicked!"
        }

        btnChangeColor.setOnClickListener {
            val textView = findViewById<TextView>(R.id.tvmain)
            textView.setTextColor(Color.RED) // Change to the desired color
        }
    }

    fun onBtnChangeTextClick(view: View) {
        val textView = findViewById<TextView>(R.id.tvmain)
        textView.text = "Button Clicked!"
    }

    fun onBtnChangeColorClick(view: View) {
        val textView = findViewById<TextView>(R.id.tvmain)
        textView.setTextColor(Color.RED) // Change to the desired color
    }
}
