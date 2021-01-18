package com.itransition.trainingprojectandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.itransition.trainingprojectandroid.mvp.MvpFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setFragmentContainer()
    }

    private fun setFragmentContainer() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, MvpFragment())
            .addToBackStack(null)
            .commit()
    }
}