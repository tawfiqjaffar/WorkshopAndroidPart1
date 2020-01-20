package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tawfiqjaffar.workshopandroidpart1.R

class Step0 : AppCompatActivity() {

    private val textToDisplay: TextView by lazy { findViewById<TextView>(R.id.textToDisplay) } // this is the text label that has to contain the string you typed
    private val editText: EditText by lazy { findViewById<EditText>(R.id.editText) } // this is the text field where you are going to type the string you want to display
    private val submit: Button by lazy { findViewById<Button>(R.id.submit) } // this is the button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step0)

        setupViews()
    }

    private fun setupViews() {
        title = "Step 0"
        codeMePlease()
    }

    private fun codeMePlease() { // fill in this method and add call as many methods as you want from here
        // TODO (not implemented)
    }
}
