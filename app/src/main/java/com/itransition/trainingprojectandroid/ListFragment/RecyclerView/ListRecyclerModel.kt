package com.itransition.trainingprojectandroid.ListFragment.RecyclerView

import com.itransition.trainingprojectandroid.ListFragment.ListInterfaces

class ListRecyclerModel(var title: String, var description: String) :
    ListInterfaces.ModelInterfaces {

    var list = ArrayList<ListRecyclerModel>()

    override fun addValue(value: ListRecyclerModel) {
        list.add(value)
    }

    override fun getData(): ArrayList<ListRecyclerModel> {
        return list
    }

}