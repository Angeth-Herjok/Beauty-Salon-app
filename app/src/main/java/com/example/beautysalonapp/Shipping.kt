package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityShippingBinding

class Shipping : AppCompatActivity() {
    lateinit var binding: ActivityShippingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shipping)
        binding = ActivityShippingBinding.inflate(layoutInflater)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.tvArrow.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        binding.btnShip.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }
    }
}