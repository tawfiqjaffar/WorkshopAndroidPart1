package com.tawfiqjaffar.workshopandroidpart1.Activities

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.gson.Gson
import com.tawfiqjaffar.workshopandroidpart1.R
import com.tawfiqjaffar.workshopandroidpart1.Utils.Api
import com.tawfiqjaffar.workshopandroidpart1.Utils.Headlines
import java.net.HttpURLConnection
import java.net.URL

class Step3 : AppCompatActivity() {

    private val submitButton : Button by lazy { findViewById<Button>(R.id.submit) }
    private val imageView : ImageView by lazy { findViewById<ImageView>(R.id.image) }
    private val context : Context by lazy { this }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step3)
        setupViews()
    }

    private fun setupViews() {
        submitButton.setOnClickListener {
            val api = Api(context)
            api.getRequest("https://newsapi.org/v2/top-headlines?country=us&apiKey=f4c277324edc428692f3185fae5b8077",
                { response ->
                    val headlines = Gson().fromJson<Headlines>(response, Headlines::class.java)
                    Log.d("newstaw", headlines.articles[0].urlToImage)
                    try {
                        val url = URL(headlines.articles[0].urlToImage)
                        val urlCon = url.openConnection() as HttpURLConnection
                        urlCon.doInput = true
                        urlCon.connect()
                        val inp = urlCon.inputStream
                        val mIcon = BitmapFactory.decodeStream(inp)
                        imageView.setImageBitmap(mIcon)
                    } catch (e: Exception){
                        Log.e("ERROR", e.message.toString())
                    }
                }, {
                    Toast.makeText(context, "Something went wrong", Toast.LENGTH_LONG).show()
                })
        }
    }
}
