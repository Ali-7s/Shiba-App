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

        val secondButton: TextView = findViewById(R.id.button2)
        val numberTextViewer: TextView = findViewById(R.id.numberTextView)
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, "", duration)

        numberTextViewer.setTextColor(ContextCompat.getColor(this, android.R.color.white))
        numberTextViewer.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple))
        secondButton.text = "TOASTY"


        secondButton.setOnClickListener {

            numberTextViewer.text = "BIG TOAST"
            toast.setText("ITS TOASTY")
            toast.show()
        }
    }
}
