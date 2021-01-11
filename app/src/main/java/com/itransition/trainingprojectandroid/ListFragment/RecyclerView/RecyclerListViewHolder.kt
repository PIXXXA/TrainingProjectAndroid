package com.itransition.trainingprojectandroid.ListFragment.RecyclerView

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.itransition.trainingprojectandroid.setToolsText
import kotlinx.android.synthetic.main.list_recycler_view.view.*

class RecyclerListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(model: ListRecyclerModel) {
        itemView.title.text = model.title.toString()
        itemView.description.text = model.description
    }

    fun setToolsText() {
        itemView.title.setToolsText(true)
        itemView.description.setToolsText(true)
    }
}