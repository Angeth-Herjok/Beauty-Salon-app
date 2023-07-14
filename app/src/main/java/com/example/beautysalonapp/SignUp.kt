package com.example.beautysalonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beautysalonapp.databinding.ActivityBraidsBinding
import com.example.beautysalonapp.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding= ActivitySignUpBinding.inflate(layoutInflater)


    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Cart::class.java)
            startActivity(intent)
        }
        binding.btnSignup.setOnClickListener {
            val intent= Intent(this, Shipping::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val intent= Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}