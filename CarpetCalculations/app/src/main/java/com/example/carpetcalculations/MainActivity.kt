package com.example.carpetcalculations

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diameterEditText = findViewById<EditText>(R.id.diameterEditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val diameterText = diameterEditText.text.toString()
            if (diameterText.isNotEmpty()) {
                val diameter = diameterText.toDouble()
                val radius = diameter / 2.0
                val maxCarpetLength = calculateMaxCarpetLength(radius)
                resultTextView.text = "Radius: $radius\nMax Carpet Length: $maxCarpetLength"
            } else {
                resultTextView.text = "Please enter a valid diameter."
            }
        }
    }

    private fun calculateMaxCarpetLength(radius: Double): Double {
        return sqrt(2.0) * radius
    }
}