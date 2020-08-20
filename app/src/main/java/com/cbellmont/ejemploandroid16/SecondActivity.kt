package com.cbellmont.ejemploandroid16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onStop = 0
    private var onDestroy = 0
    private var onRestart = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(javaClass.name, "onCreate $onCreate")
        onCreate++
    }

    override fun onStart() {
        super.onStart()
        Log.d(javaClass.name, "onStart $onStart")
        onStart++
    }

    override fun onResume() {
        super.onResume()
        Log.d(javaClass.name, "onResume $onResume")
        onResume++
    }

    override fun onPause() {
        super.onPause()
        Log.d(javaClass.name, "onPause $onPause")
        onPause++
    }

    override fun onStop() {
        Log.d(javaClass.name, "onStop $onStop")
        onStop++
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(javaClass.name, "onDestroy $onDestroy")
        onDestroy++
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(javaClass.name, "onRestart $onRestart")
        onRestart++
    }
}