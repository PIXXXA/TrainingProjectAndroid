package com.itransition.trainingprojectandroid

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.itransition.trainingprojectandroid.ListFragment.ListFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setFragmentContainer()
    }

    private fun setFragmentContainer() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, ListFragment())
            .addToBackStack(null)
            .commit()
    }
}