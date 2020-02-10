package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.tawfiqjaffar.workshopandroidpart1.R

class Step3 : AppCompatActivity() {

    private val submitButton : Button by lazy { findViewById<Button>(R.id.submit) } // this is the button that you will use to send a request
    private val imageView : ImageView by lazy { findViewById<ImageView>(R.id.image) } // this is the imageview that will hold the images you receive
    private val context : Context by lazy { this } // ignore this

    private var index = 0 // hint ?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step3)
        setupViews()
    }

    private fun setupViews() {
        title = "Step 3"
        codeMePlease()
    }

    private fun codeMePlease() { // fill in this method and add call as many methods as you want from here
    }
}
