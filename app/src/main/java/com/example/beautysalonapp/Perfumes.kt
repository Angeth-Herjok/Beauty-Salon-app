package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityPerfumesBinding

class Perfumes : AppCompatActivity() {
    lateinit var binding: ActivityPerfumesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfumes)
        binding= ActivityPerfumesBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Braids::class.java)
            startActivity(intent)
        }
        binding.btnSelect.setOnClickListener {
            val intent= Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}