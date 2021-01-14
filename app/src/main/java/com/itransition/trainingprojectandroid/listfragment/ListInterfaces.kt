package com.itransition.trainingprojectandroid.listfragment

import com.itransition.trainingprojectandroid.listfragment.recyclerview.ListRecyclerModel
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEnd

interface ListInterfaces : MvpView {

    @AddToEnd
    fun getData(value: ArrayList<ListRecyclerModel>)

    @AddToEnd
    fun addValue(value: ArrayList<ListRecyclerModel>)
}