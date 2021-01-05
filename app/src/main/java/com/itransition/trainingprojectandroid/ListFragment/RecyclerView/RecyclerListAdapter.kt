package com.itransition.trainingprojectandroid.ListFragment.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itransition.trainingprojectandroid.R

class RecyclerListAdapter(
    var value: ArrayList<ListRecyclerModel>,
    var context: Context
) : RecyclerView.Adapter<RecyclerListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerListViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.list_recycler_view, parent, false)
        return RecyclerListViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return value.size
    }

    override fun onBindViewHolder(holder: RecyclerListViewHolder, position: Int) {
        holder.bind(value[position])
    }
}