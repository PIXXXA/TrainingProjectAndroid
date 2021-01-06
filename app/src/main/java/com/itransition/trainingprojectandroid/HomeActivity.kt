package com.itransition.trainingprojectandroid

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.ListFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setFragmentContainer()
    }

    private fun setFragmentContainer() {
        val listFragment = ListFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, listFragment)
            .addToBackStack(null)
            .commit()
    }
}