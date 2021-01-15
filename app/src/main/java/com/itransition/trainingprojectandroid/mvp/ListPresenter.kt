package com.itransition.trainingprojectandroid.mvp

import com.itransition.trainingprojectandroid.mvp.recyclerview.ListRecyclerModel

class ListPresenter(var view: ListInterfaces.DataView) : ListInterfaces.Presenter {

    private var list: ArrayList<ListRecyclerModel> = arrayListOf()

    init {
        val model: ListRecyclerModel? = ListRecyclerModel(DEF_TITLE, DEF_DESCRIPTION)
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

    companion object {
        const val DEF_TITLE = 0
        const val DEF_DESCRIPTION = ""
    }
}