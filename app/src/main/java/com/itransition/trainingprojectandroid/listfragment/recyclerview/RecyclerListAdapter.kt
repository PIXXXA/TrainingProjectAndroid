package com.itransition.trainingprojectandroid.listfragment.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itransition.trainingprojectandroid.R
import com.itransition.trainingprojectandroid.listfragment.recyclerview.ListRecyclerModel
import com.itransition.trainingprojectandroid.listfragment.recyclerview.RecyclerListViewHolder

class RecyclerListAdapter(
    var value: ArrayList<ListRecyclerModel>,
    var context: Context
) : RecyclerView.Adapter<RecyclerListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerListViewHolder {
        return RecyclerListViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_recycler_view, parent, false))
    }

    override fun getItemCount(): Int {
        return value.size
    }

    override fun onBindViewHolder(holder: RecyclerListViewHolder, position: Int) {
        holder.setToolsText()
        holder.bind(value[position])
    }
}