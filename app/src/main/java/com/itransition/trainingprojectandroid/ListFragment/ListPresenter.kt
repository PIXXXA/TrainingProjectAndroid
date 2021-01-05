package com.itransition.trainingprojectandroid.ListFragment

import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.ListRecyclerModel

class ListPresenter(var view: ListInterfaces.DataView) : ListInterfaces.Presenter {

    private lateinit var model: ListRecyclerModel

    init {
        setModelData()
    }

    private fun setModelData() {
        model.addValue(
            ListRecyclerModel(
                "1",
                "first"
            )
        )
        model.addValue(
            ListRecyclerModel(
                "2",
                "second"
            )
        )
        model.addValue(
            ListRecyclerModel(
                "3",
                "third"
            )
        )
        model.addValue(
            ListRecyclerModel(
                "4",
                "fourth"
            )
        )
    }

    override fun getData() {
        view.getDataFromPresenter(model.getData())
    }
}