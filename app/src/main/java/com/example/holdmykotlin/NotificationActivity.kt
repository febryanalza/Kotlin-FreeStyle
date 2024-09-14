package com.example.holdmykotlin

import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.example.holdmykotlin.databinding.ActivityNotificationBinding
import com.example.holdmykotlin.utils.setupBottomNavigationBar
//import com.google.android.material.bottomnavigation.BottomNavigationView

class NotificationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigationBar(
            context = this,
            bottomNavigationView =  binding.bottomNavigationView)
    }
}