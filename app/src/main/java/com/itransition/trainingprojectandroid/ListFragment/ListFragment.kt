package com.itransition.trainingprojectandroid.ListFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.ListRecyclerModel
import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.RecyclerListAdapter
import com.itransition.trainingprojectandroid.R
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment(), ListInterfaces.DataView {

    private lateinit var presenter: ListInterfaces.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ListPresenter(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        initView()
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    private fun initView() {
        presenter.getData()
    }

    override fun getDataFromPresenter(value: ArrayList<ListRecyclerModel>) {
        val recyclerListAdapter = RecyclerListAdapter(value, view!!.context)
        recycler_view.layoutManager = LinearLayoutManager(context)
        recycler_view.adapter = recyclerListAdapter
    }
}