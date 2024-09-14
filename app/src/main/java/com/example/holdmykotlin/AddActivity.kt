package com.example.holdmykotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.holdmykotlin.databinding.ActivityAddBinding
import com.example.holdmykotlin.databinding.ActivitySearchBinding
import com.example.holdmykotlin.utils.setupBottomNavigationBar
import com.google.android.material.bottomnavigation.BottomNavigationView

class AddActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setupBottomNavigationBar(
            context = this,
            bottomNavigationView =  binding.bottomNavigationView)
    }
}