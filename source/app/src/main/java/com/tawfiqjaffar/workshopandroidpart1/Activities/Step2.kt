package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.tawfiqjaffar.workshopandroidpart1.R

class Step2 : AppCompatActivity() {


    private val image: ImageView by lazy { findViewById<ImageView>(R.id.image) }
    private val previousButotn: Button by lazy { findViewById<Button>(R.id.previous) }
    private val nextButton: Button by lazy { findViewById<Button>(R.id.next) }

    private val context: Context by lazy { this }

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step2)

        setupViews()
    }

    private fun setupViews() {
        title = "Step 2"

        image.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.avengers))
        this.previousButotn.setOnClickListener {
            this.index = if (this.index - 1 < 0) 3 else index - 1
            this.setupImageCarousel()
        }
        this.nextButton.setOnClickListener {
            this.index = if (this.index + 1 > 4) 0 else index + 1
            this.setupImageCarousel()
        }
    }

    private fun setupImageCarousel() {
        val imageArray = arrayListOf(
            ContextCompat.getDrawable(context, R.drawable.kotlin),
            ContextCompat.getDrawable(context, R.drawable.avengers),
            ContextCompat.getDrawable(context, R.drawable.epitech),
            ContextCompat.getDrawable(context, R.drawable.shield)
        )
        this.image.setImageDrawable(imageArray[index % imageArray.size])
    }
}
