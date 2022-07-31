package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.annotation.MainThread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val intent = Intent(this@MainActivity, DetailActivity::class.java)
//        startActivity(intent)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LinearActivity::class.java))
            finishAffinity()
        }, 2000)
    }

}