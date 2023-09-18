package com.example.lifecyclemethods

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "LifeCycleMethods"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate Method")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart Method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart Method")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume Method")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop Method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy Method")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause Method")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.i(TAG, "onBackPressed Method")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState Method")
    }
}


