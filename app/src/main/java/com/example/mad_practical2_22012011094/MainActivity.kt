package com.example.mad_practical2_24012011102

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display(msg = "onCreate method is called ")
    }

    override fun onStart() {
        super.onStart()
        display("onStart method is called")
    }

    override fun onPause() {
        super.onPause()
        display("onPause method is called")
    }

    override fun onResume() {
        super.onResume()
        display("onResume method is called")
    }

    override fun onStop() {
        super.onStop()
        display("onStop method is called")
    }

    override fun onRestart() {
        super.onRestart()
        display("onRestart method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        display("onDestroy method is called")
    }

    private fun display(msg: String) {
        // 1. LogCat Message
        Log.i(TAG, msg)
        // 2. Toast Message
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        // 3. Snackbar msg
        val rootView = findViewById<View>(R.id.main)
        if (rootView != null) {
            Snackbar.make(rootView, msg, Snackbar.LENGTH_SHORT).show()
        }
    }
}
