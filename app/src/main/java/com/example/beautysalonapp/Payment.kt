package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityPaymentBinding
import com.example.beautysalonapp.databinding.ActivitySignUpBinding

class Payment : AppCompatActivity() {
    lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        binding= ActivityPaymentBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.tvTitle.setOnClickListener {
            val intent = Intent(this, Shipping::class.java)
            startActivity(intent)
        }
        binding.btnCheckout.setOnClickListener {
            val intent = Intent(this, Screen::class.java)
            startActivity(intent)
        }
    }
}