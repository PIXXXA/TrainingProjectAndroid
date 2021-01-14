package com.itransition.trainingprojectandroid.listfragment.recyclerview

import com.itransition.trainingprojectandroid.listfragment.ListInterfaces

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