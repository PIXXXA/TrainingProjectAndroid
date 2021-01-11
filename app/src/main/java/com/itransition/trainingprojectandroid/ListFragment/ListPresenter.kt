package com.itransition.trainingprojectandroid.ListFragment

import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.ListRecyclerModel
import com.itransition.trainingprojectandroid.setRecyclerView

class ListPresenter(var view: ListInterfaces.DataView) : ListInterfaces.Presenter {

    private var list: ArrayList<ListRecyclerModel> = arrayListOf()

    init {
        val model: ListRecyclerModel? = ListRecyclerModel(DEF_TITLE,DEF_DESCRIPTION)
        model?.let { this.setRecyclerView(it,list) }
    }

    override fun getData() {
        view.getDataFromPresenter(list)
    }

    companion object{
        const val DEF_TITLE = 0
        const val DEF_DESCRIPTION = ""
    }
}