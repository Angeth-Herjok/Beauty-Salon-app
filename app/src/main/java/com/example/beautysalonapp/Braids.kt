package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityBraidsBinding

class Braids : AppCompatActivity() {
    lateinit var binding: ActivityBraidsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_braids)
        binding= ActivityBraidsBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Products::class.java)
            startActivity(intent)
        }
        binding.btnProceed.setOnClickListener {
            val intent= Intent(this, Products::class.java)
            startActivity(intent)
        }
    }
}