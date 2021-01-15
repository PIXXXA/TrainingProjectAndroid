package com.itransition.trainingprojectandroid.mvp

import com.itransition.trainingprojectandroid.mvp.recyclerview.ListRecyclerModel

interface ListInterfaces {

    interface DataView {
        fun getDataFromPresenter(value: ArrayList<ListRecyclerModel>)
    }

    interface Presenter {
        fun getData()
    }

    interface ModelInterfaces {
        fun addValue(value: ArrayList<ListRecyclerModel>)
        fun getData(value: ArrayList<ListRecyclerModel>): ArrayList<ListRecyclerModel>
    }
}