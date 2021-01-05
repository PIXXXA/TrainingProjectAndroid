package com.itransition.trainingprojectandroid.ListFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.ListRecyclerModel
import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.RecyclerListAdapter
import com.itransition.trainingprojectandroid.R
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment(), ListInterfaces.DataView {

    private var presenter: ListInterfaces.Presenter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        presenter = ListPresenter(this)
        initView()
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    private fun initView() {
        recycler_view.layoutManager = LinearLayoutManager(context)
        presenter?.getData()
    }

    override fun getDataFromPresenter(value: ArrayList<ListRecyclerModel>) {
        val recyclerListAdapter = RecyclerListAdapter(value, view!!.context)
        recycler_view.adapter = recyclerListAdapter
    }
}