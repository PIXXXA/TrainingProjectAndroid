package com.itransition.trainingprojectandroid.mvp

import com.itransition.trainingprojectandroid.mvp.recyclerview.ListRecyclerModel
import com.itransition.trainingprojectandroid.listfragment.recyclerview.ListRecyclerModel
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class ListPresenter : MvpPresenter<ListInterfaces>() {

    private var list: ArrayList<ListRecyclerModel> = arrayListOf()

    init {
        for (i in 1..4) {
            list.add(
                ListRecyclerModel(i, "$")
            )
        }
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.addValue(list)
        viewState.getData(list)
    }
}