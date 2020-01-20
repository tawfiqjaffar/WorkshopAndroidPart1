package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tawfiqjaffar.workshopandroidpart1.R

class Step2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step2)

        setupViews()
    }

    private fun setupViews() {
        title = "Step 2"
    }
}
