package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityLoginBinding
import com.example.beautysalonapp.databinding.ActivityTracingBinding

class Tracing : AppCompatActivity() {
    lateinit var binding: ActivityTracingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracing)
        binding= ActivityTracingBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent = Intent(this, Confirmation::class.java)
            startActivity(intent)
        }
        binding.btnReviews.setOnClickListener {
            val intent = Intent(this, Confirmation::class.java)
            startActivity(intent)
        }
    }
}