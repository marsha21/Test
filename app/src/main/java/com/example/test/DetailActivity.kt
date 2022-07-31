package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra(EXTRA_NAME)
        val image = intent.getIntExtra(EXTRA_IMAGE, 0)

        binding.tvText.text = name.toString()
        binding.imageView.setImageResource(image)


    }

    companion object{
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAME = "extra_name"
    }
}