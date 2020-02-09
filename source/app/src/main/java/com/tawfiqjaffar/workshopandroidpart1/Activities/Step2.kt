package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.tawfiqjaffar.workshopandroidpart1.R

class Step2 : AppCompatActivity() {


    private val image: ImageView by lazy { findViewById<ImageView>(R.id.image) } // this is the imageview that is going to hold our image carousel
    private val previousButotn: Button by lazy { findViewById<Button>(R.id.previous) } // previous button
    private val nextButton: Button by lazy { findViewById<Button>(R.id.next) } // next button

    private val context: Context by lazy { this } // ignore this

    private var index = 0 // hint ?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step2)

        setupViews()
    }

    private fun setupViews() {
        title = "Step 2"

        codeMePlease()
    }

    private fun codeMePlease() { // fill in this method and add call as many methods as you want from here
    }
}
