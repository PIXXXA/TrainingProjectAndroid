package com.itransition.trainingprojectandroid.listfragment

import com.itransition.trainingprojectandroid.listfragment.recyclerview.ListRecyclerModel

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