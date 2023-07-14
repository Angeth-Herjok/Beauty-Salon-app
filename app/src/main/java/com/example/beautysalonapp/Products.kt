package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityProductsBinding

class Products : AppCompatActivity() {
    lateinit var binding: ActivityProductsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        binding= ActivityProductsBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Category::class.java)
            startActivity(intent)
        }
        binding.btnBraids.setOnClickListener {
            val intent= Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}