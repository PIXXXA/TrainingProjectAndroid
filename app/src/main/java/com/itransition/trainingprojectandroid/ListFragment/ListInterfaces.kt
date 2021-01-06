package com.itransition.trainingprojectandroid.ListFragment

import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.ListRecyclerModel

interface ListInterfaces {

    interface DataView {
        fun getDataFromPresenter(value: ArrayList<ListRecyclerModel>)
    }

    interface Presenter {
        fun getData()
    }

    interface ModelInterfaces {
        fun addValue(value: ListRecyclerModel)
        fun getData(): ArrayList<ListRecyclerModel>
    }
}