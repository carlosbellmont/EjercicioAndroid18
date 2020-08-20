package com.cbellmont.ejemploandroid16

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val CLAVE_1 = "ClaveSecondActivityString"

        fun getIntent(context: Context, saludo : String): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(CLAVE_1, saludo)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvTexto.append(intent.getStringExtra(CLAVE_1))
    }
}