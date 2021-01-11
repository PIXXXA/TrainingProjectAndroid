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

    private var presenter: ListInterfaces.Presenter = ListPresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        recycler_view.layoutManager = LinearLayoutManager(this.context)
        presenter.getData()
    }

    override fun getDataFromPresenter(value: ArrayList<ListRecyclerModel>) {
        val recyclerListAdapter = context?.let { RecyclerListAdapter(value, it) }
        recycler_view.adapter = recyclerListAdapter
    }
}