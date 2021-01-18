package com.itransition.trainingprojectandroid.mvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.itransition.trainingprojectandroid.R
import com.itransition.trainingprojectandroid.mvp.interfaces.SetDataInterfaces
import com.itransition.trainingprojectandroid.mvp.presenter.SetDataPresenter
import com.itransition.trainingprojectandroid.mvp.recyclerview.RecyclerListAdapter
import com.itransition.trainingprojectandroid.mvp.recyclerview.RecyclerModel
import kotlinx.android.synthetic.main.fragment_list.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter

class MvpFragment : MvpAppCompatFragment(),
    SetDataInterfaces {

    @InjectPresenter
    lateinit var setDataPresenter: SetDataPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun addValue(value: ArrayList<RecyclerModel>) {
        recycler_view.layoutManager = LinearLayoutManager(this.context)
        val recyclerListAdapter = context?.let { RecyclerListAdapter(value, it) }
        recycler_view.adapter = recyclerListAdapter
    }

}