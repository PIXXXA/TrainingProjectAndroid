package com.itransition.trainingprojectandroid.ListFragment

import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.ListRecyclerModel

class ListPresenter(var view: ListInterfaces.DataView) : ListInterfaces.Presenter {

    private var list: ArrayList<ListRecyclerModel> = arrayListOf()

    init {
        val model: ListRecyclerModel? = ListRecyclerModel(3,"sadfsdf")
        for (i in 1..4) {
            list.add(
                ListRecyclerModel(i, "$")
            )
        }
        model?.addValue(list)
    }

    override fun getData() {
        view.getDataFromPresenter(list)
    }
}