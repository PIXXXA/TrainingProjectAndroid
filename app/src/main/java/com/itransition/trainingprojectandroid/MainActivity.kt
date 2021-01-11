package com.itransition.trainingprojectandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        configSplashScreen()
    }

    private fun configSplashScreen() {
        imageView.setImage(this, R.drawable.ic_splash_screen)
        this.setSplashScreen(DELAY_TIME, HomeActivity())
    }

    companion object {
        private const val DELAY_TIME: Long = 2000
    }
}