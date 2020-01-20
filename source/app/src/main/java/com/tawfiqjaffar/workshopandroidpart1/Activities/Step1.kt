package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tawfiqjaffar.workshopandroidpart1.R

class Step1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step1)

        setupViews()
    }

    private fun setupViews() {
        title = "Step 1"
    }
}
