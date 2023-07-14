package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityScreenBinding
import com.example.beautysalonapp.databinding.ActivitySignUpBinding

class Screen : AppCompatActivity() {
    lateinit var binding: ActivityScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)
        binding= ActivityScreenBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }
        binding.btnSend.setOnClickListener {
            val intent = Intent(this, Confirmation::class.java)
            startActivity(intent)
        }
    }
}