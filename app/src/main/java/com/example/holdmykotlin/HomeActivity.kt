package com.example.holdmykotlin

//import android.content.Intent
import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import androidx.fragment.app.Fragment
import com.example.holdmykotlin.databinding.ActivityHomeBinding
//import com.example.holdmykotlin.databinding.ActivityNotificationBinding
//import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.holdmykotlin.utils.setupBottomNavigationBar

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigationBar(
            context = this,
            bottomNavigationView =  binding.bottomNavigationView)
    }

}