package com.example.myfirstapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton: TextView = findViewById(R.id.button1)
        val secondButton: TextView = findViewById(R.id.button2)

        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, "", duration)
        val imageView: ImageView = findViewById(R.id.imageView)

        imageView.isVisible = false

        firstButton.text = "Feed"
        secondButton.text = "Pet"


        firstButton.setOnClickListener {
            imageView.setImageResource(R.drawable.image_3)
            imageView.isVisible = true
            toast.setText("very calm...")
            toast.show()

        }

        secondButton.setOnClickListener {
            imageView.setImageResource(R.drawable.angry_shiba)
            imageView.isVisible = true
            toast.setText("GRRRRRRRR")
            toast.show()
        }
    }
}
