package com.example.holdmykotlin

import android.content.Intent
import android.os.Bundle
//import android.window.OnBackInvokedDispatcher
//import androidx.activity.OnBackPressedCallback
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.example.holdmykotlin.databinding.ActivityAccountBinding
//import com.example.holdmykotlin.databinding.ActivitySearchBinding
import com.example.holdmykotlin.utils.setupBottomNavigationBar
//import com.google.android.material.bottomnavigation.BottomNavigationView

class AccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigationBar(
            context = this,
            bottomNavigationView =  binding.bottomNavigationView)

        binding.loginButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.buttonRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}