package com.tawfiqjaffar.workshopandroidpart1.Activities.Step4

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.tawfiqjaffar.workshopandroidpart1.R
import com.tawfiqjaffar.workshopandroidpart1.Utils.Api
import com.tawfiqjaffar.workshopandroidpart1.Utils.Article
import com.tawfiqjaffar.workshopandroidpart1.Utils.Headlines

class Step4 : AppCompatActivity() {

    private val context: Context by lazy { this } // ignore this

    private val recyclerView: RecyclerView by lazy { findViewById<RecyclerView>(R.id.recycler) } // this is the element that scrolls to display everything
    private val dataSet = arrayListOf<Article>() // this is the list which will contain our data
    private val adapter: Step4Adapter by lazy { Step4Adapter(this.dataSet, this.context) } // this is the element which will link the recyclerview to our data

    private val getArticles: Button by lazy { findViewById<Button>(R.id.getArticles) } // this is the button which will retrieve our data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step4)

        codeMePlease()
    }

    private fun codeMePlease() { // fill in this method and add call as many methods as you want from here
    }
}

