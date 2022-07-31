package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {

            val email = binding.emailEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            when {
                email.isEmpty() -> {
                    binding.emailEditText.error = "Masih kosong"
                }
                password.isEmpty() -> {
                    binding.passwordEditText.error = "Masih kosong"
                }

                else -> {
                    val moveWithDataIntent = Intent( this@IntentActivity, DetailActivity::class.java)
                    moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, email)
                    moveWithDataIntent.putExtra(DetailActivity.EXTRA_IMAGE, R.drawable.user1)
                    startActivity(moveWithDataIntent)

                }
            }
        }
    }
}