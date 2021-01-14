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

fun ImageView.setImage(context: Context, id: Int) {
    this.setImageDrawable(ContextCompat.getDrawable(context, id));
}

fun TextView.setTextVisibility(visibility: Boolean) {
    if (visibility) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}