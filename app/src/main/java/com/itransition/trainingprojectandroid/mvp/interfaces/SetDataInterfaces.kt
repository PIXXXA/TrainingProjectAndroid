package com.itransition.trainingprojectandroid.mvp.interfaces

import com.itransition.trainingprojectandroid.mvp.recyclerview.RecyclerModel
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEnd

interface SetDataInterfaces : MvpView {

    @AddToEnd
    fun addValue(value: ArrayList<RecyclerModel>)
}