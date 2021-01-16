package com.itransition.trainingprojectandroid.mvp.recyclerview

import com.itransition.trainingprojectandroid.mvp.ListInterfaces

class ListRecyclerModel(var title: Int, var description: String) :
    ListInterfaces {

    override fun addValue(value: ArrayList<ListRecyclerModel>) {
        val list = ArrayList<ListRecyclerModel>()
        list.addAll(value)
    }

    override fun getData(value: ArrayList<ListRecyclerModel>){
        TODO("Not yet implemented")
    }
}