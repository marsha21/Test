package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class LinearActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        imageView = findViewById<ImageView>(R.id.iv_1)
        imageView.setOnClickListener {
            var toRelative = Intent(this@LinearActivity, RelativeActivity::class.java)
            startActivity(toRelative)
        }
    }
}