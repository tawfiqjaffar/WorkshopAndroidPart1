package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.tawfiqjaffar.workshopandroidpart1.R

class Step1 : AppCompatActivity() {

    private val operatorChooser: Spinner by lazy { findViewById<Spinner>(R.id.operator) } // ignore this
    private val context: Context by lazy { this } // ignore this

    private val operand1: EditText by lazy { findViewById<EditText>(R.id.operand1) } // this is the text field that contains the first operand
    private val operand2: EditText by lazy { findViewById<EditText>(R.id.operand2) } // this is the text field that contains the second operand
    private var selectedOperator: String =
        "+" // this is the string that corresponds to the selected operator (+, -, *, /, %) you don't need to change it's value, that's already done for you when you choose an operator in the dropdown menu
    private val result: TextView by lazy { findViewById<TextView>(R.id.result) } // this is the text view that should contain the result

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step1)

        setupViews()
        codeMePlease()
    }

    private fun setupViews() {
        title = "Step 1"
        val items = arrayListOf<String>("+", "-", "*", "/", "%")
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items)

        operatorChooser.adapter = arrayAdapter

        operatorChooser.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                selectedOperator = items[position]
                Toast.makeText(context, selectedOperator, Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun codeMePlease() { // fill in this method and add call as many methods as you want from here
        // TODO (not implemented)
    }
}
