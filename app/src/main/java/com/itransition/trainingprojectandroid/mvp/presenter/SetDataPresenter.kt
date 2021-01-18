package com.itransition.trainingprojectandroid.mvp.presenter

import com.itransition.trainingprojectandroid.mvp.interfaces.SetDataInterfaces
import com.itransition.trainingprojectandroid.mvp.recyclerview.RecyclerModel
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class SetDataPresenter : MvpPresenter<SetDataInterfaces>() {

    private var list: ArrayList<RecyclerModel> = arrayListOf()

    init {
        for (i in 1..4) {
            list.add(
                RecyclerModel(i, "$")
            )
        }
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.addValue(list)
    }

}