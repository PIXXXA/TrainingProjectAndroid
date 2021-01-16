package com.itransition.trainingprojectandroid.mvp

import com.itransition.trainingprojectandroid.mvp.recyclerview.ListRecyclerModel
import com.itransition.trainingprojectandroid.listfragment.recyclerview.ListRecyclerModel
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEnd

interface ListInterfaces : MvpView {

    @AddToEnd
    fun getData(value: ArrayList<ListRecyclerModel>)

    @AddToEnd
    fun addValue(value: ArrayList<ListRecyclerModel>)
}