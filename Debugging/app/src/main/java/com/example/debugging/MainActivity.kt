
package com.example.debugging

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "LOGGER"
private var status = VERBOSE

class MainActivity : AppCompatActivity() {
    private lateinit var helloTextView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.hello_world)
        helloTextView.text = "Hello, debugging!"
        val button = findViewById<Button>(R.id.button) // Replace 'button_id' with your button's ID
        button.setOnClickListener { clickButton() }
        clickButton()
    }

    private fun clickButton() {
        when (status) {
            VERBOSE -> {
                Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
                status = DEBUG
            }
            DEBUG -> {
                Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
                status = INFO
            }
            INFO -> {
                Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
                status = WARN
            }
            WARN -> {
                Log.w(TAG, "WARN: warns about the potential for serious errors")
                status = ERROR
            }
            ERROR -> {
                Log.e(TAG, "ERROR: a serious error like an app crash")
                status = VERBOSE
            }
        }
        setElements()
    }

    @SuppressLint("SetTextI18n")
    private fun setElements() {
        when (status) {
            VERBOSE -> {
                helloTextView.text = "Verbose"
            }
            DEBUG -> {
                helloTextView.text = "Debug"
            }
            INFO -> {
                helloTextView.text = "Info"
            }
            WARN -> {
                helloTextView.text = "Warning"
            }
            ERROR -> {
                helloTextView.text = "Error"
            }
        }
    }
}