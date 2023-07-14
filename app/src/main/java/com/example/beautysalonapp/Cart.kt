package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityCartBinding
import com.example.beautysalonapp.databinding.ActivityProductsBinding

class Cart : AppCompatActivity() {
    lateinit var binding: ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        binding= ActivityCartBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Braids::class.java)
            startActivity(intent)
        }
        binding.btnCart.setOnClickListener {
            val intent= Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}