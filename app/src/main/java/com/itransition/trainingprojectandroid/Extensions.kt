package com.itransition.trainingprojectandroid

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.itransition.trainingprojectandroid.ListFragment.ListFragment
import com.itransition.trainingprojectandroid.ListFragment.ListPresenter
import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.ListRecyclerModel
import com.itransition.trainingprojectandroid.ListFragment.RecyclerView.RecyclerListAdapter
import kotlinx.android.synthetic.main.fragment_list.*

fun Activity.setSplashScreen(delayTime: Long, activity: Activity) {
    Handler().postDelayed({
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
        finish()
    }, delayTime)
}

fun ListPresenter.setRecyclerView(model: ListRecyclerModel, list: ArrayList<ListRecyclerModel>) {
    for (i in 1..4) {
        list.add(
            ListRecyclerModel(i, "$")
        )
    }
    model.addValue(list)
}

fun ListFragment.configAdapter(value: ArrayList<ListRecyclerModel>) {
    recycler_view.layoutManager = LinearLayoutManager(this.context)
    val recyclerListAdapter = context?.let { RecyclerListAdapter(value, it) }
    recycler_view.adapter = recyclerListAdapter
}

fun ImageView.setImage(context: Context, id: Int) {
    this.setImageDrawable(ContextCompat.getDrawable(context, id));
}

fun TextView.setToolsText(visibility: Boolean) {
    if (visibility) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}