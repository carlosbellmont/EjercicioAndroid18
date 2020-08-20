package com.cbellmont.ejemploandroid16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val CLAVE_1 = "ClaveSecondActivityString"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvTexto.append(intent.getStringExtra(CLAVE_1))
    }
}