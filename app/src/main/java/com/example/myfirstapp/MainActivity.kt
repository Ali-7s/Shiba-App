package com.example.myfirstapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton: TextView = findViewById(R.id.button1)
        val secondButton: TextView = findViewById(R.id.button2)
        val numberTextViewer: TextView = findViewById(R.id.numberTextView)
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, "", duration)
        var count = 0

        numberTextViewer.text = count.toString()
        numberTextViewer.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
        numberTextViewer.setBackgroundColor(ContextCompat.getColor(this, android.R.color.black))
        firstButton.text = "Increment"
        secondButton.text = "Decrement"




        firstButton.setOnClickListener {
            count += 1
            numberTextViewer.text = count.toString()
            toast.setText("Incremented!")
            toast.show()
        }

        secondButton.setOnClickListener {
            count -= 1
            numberTextViewer.text = count.toString()
            toast.setText("Decremented!")
            toast.show()
        }
    }
}
