package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityLandingPageBinding

class LandingPage : AppCompatActivity() {
    lateinit var binding: ActivityLandingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
        binding= ActivityLandingPageBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
//        binding..setOnClickListener {
//            val intent= Intent(this,LandingPage::class.java)
//            startActivity(intent)
//        }
        binding.tvProducts.setOnClickListener {
            val intent= Intent(this, Category::class.java)
            startActivity(intent)
        }
    }

}