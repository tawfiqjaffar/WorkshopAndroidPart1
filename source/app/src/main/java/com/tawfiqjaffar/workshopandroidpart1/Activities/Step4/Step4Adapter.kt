package com.tawfiqjaffar.workshopandroidpart1.Activities.Step4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tawfiqjaffar.workshopandroidpart1.R
import com.tawfiqjaffar.workshopandroidpart1.Utils.Article

class Step4Adapter(private val dataSet: List<Article>, private val context: Context) : RecyclerView.Adapter<Step4Adapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(this.context)
            .inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return this.dataSet.size
    }
}