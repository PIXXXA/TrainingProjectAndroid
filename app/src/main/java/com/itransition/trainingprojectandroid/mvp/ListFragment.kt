package com.itransition.trainingprojectandroid.mvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.itransition.trainingprojectandroid.mvp.recyclerview.ListRecyclerModel
import com.itransition.trainingprojectandroid.mvp.recyclerview.RecyclerListAdapter
import com.itransition.trainingprojectandroid.R
import kotlinx.android.synthetic.main.fragment_list.*
import moxy.MvpFragment
import moxy.presenter.InjectPresenter

class ListFragment : MvpFragment(), ListInterfaces {

    @InjectPresenter
    lateinit var presenter: ListPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun getData(value: ArrayList<ListRecyclerModel>) {
        recycler_view.layoutManager = LinearLayoutManager(this.context)
        val recyclerListAdapter = context?.let { RecyclerListAdapter(value, it) }
        recycler_view.adapter = recyclerListAdapter
    }

    override fun addValue(value: ArrayList<ListRecyclerModel>) {
        TODO("Not yet implemented")
    }
}