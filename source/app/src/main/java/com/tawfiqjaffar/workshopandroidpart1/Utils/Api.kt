package com.tawfiqjaffar.workshopandroidpart1.Utils

import android.content.Context
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Api(private val context: Context) {
    fun getRequest(route : String,
                   callback : ((response : String) -> Unit),
                   errorCallback : (() -> Unit)) {
        val queue = Volley.newRequestQueue(context)
        val req = StringRequest(Request.Method.GET, route,
            Response.Listener <String>{ response -> callback(response) },
            Response.ErrorListener { errorCallback() })
        queue.add(req)
    }
}