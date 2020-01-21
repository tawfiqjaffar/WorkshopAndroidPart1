package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.tawfiqjaffar.workshopandroidpart1.R

class Splash : AppCompatActivity() {

    private val buttonStep0: Button by lazy { findViewById<Button>(R.id.step0) }
    private val buttonStep1: Button by lazy { findViewById<Button>(R.id.step1) }
    private val buttonStep2: Button by lazy { findViewById<Button>(R.id.step2) }

    private val context: Context by lazy { this }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setupViews()
    }

    private fun setupViews() {
        buttonStep0.setOnClickListener {
            startActivity(Intent(context, Step0::class.java))
        }
        buttonStep1.setOnClickListener {
            startActivity(Intent(context, Step1::class.java))
        }
        buttonStep2.setOnClickListener {
            startActivity(Intent(context, Step2::class.java))
        }
    }
}
