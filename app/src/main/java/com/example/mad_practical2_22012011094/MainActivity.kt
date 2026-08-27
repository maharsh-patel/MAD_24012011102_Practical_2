package com.example.mad_practical2_22012011094

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.example.mad_practical2_24012011102.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        showMessage("onCreate method is called")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        showSnackbarMessage("onCreate method is called")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    var TAG = "MainActivity"
    fun showMessage(msg:String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is called")

    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart method is called")
    }
    fun showSnackbarMessage(msg:String){
        Log.i(TAG, msg)
        Snackbar.make(findViewById(R.id.main),msg,Snackbar.LENGTH_SHORT).show()
    }
}