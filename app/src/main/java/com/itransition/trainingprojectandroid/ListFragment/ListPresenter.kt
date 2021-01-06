package com.itransition.trainingprojectandroid.ListFragment

import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.ListRecyclerModel

class ListPresenter(var view: ListInterfaces.DataView) : ListInterfaces.Presenter {

    private lateinit var model: ListRecyclerModel

    init {
        setModelData()
    }

    private fun setModelData() {
        for(i in 1..4)
        model.addValue(
            ListRecyclerModel(
                i.toString(),
                "$"
            )
        )
    }

    override fun getData() {
        view.getDataFromPresenter(model.getData())
    }
}