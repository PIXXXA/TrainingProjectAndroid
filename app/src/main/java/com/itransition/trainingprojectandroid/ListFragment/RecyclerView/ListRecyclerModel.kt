package com.itransition.trainingprojectandroid.ListFragment.RecyclerView

import com.itransition.trainingprojectandroid.ListFragment.ListInterfaces

class ListRecyclerModel(var title: Int, var description: String) :
    ListInterfaces.ModelInterfaces {

    var list = ArrayList<ListRecyclerModel>()

    override fun addValue(value : ArrayList<ListRecyclerModel>) {
        list.addAll(value)
    }

    override fun getData(value : ArrayList<ListRecyclerModel>): ArrayList<ListRecyclerModel> {
        return value
    }
}