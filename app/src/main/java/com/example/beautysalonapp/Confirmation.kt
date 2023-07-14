package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityConfirmationBinding
import com.example.beautysalonapp.databinding.ActivityLoginBinding

class Confirmation : AppCompatActivity() {
    lateinit var binding: ActivityConfirmationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)
        binding= ActivityConfirmationBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent = Intent(this, Shipping::class.java)
            startActivity(intent)
        }
        binding.btnTrace.setOnClickListener {
            val intent = Intent(this, Reviews::class.java)
            startActivity(intent)
        }
    }
}