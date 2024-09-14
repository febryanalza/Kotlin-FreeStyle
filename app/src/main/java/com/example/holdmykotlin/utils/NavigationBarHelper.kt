package com.example.holdmykotlin.utils

import android.content.Context
import android.content.Intent
import com.example.holdmykotlin.R
import com.example.holdmykotlin.HomeActivity
import com.example.holdmykotlin.AccountActivity
import com.example.holdmykotlin.SearchActivity
import com.example.holdmykotlin.AddActivity
import com.example.holdmykotlin.NotificationActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun setupBottomNavigationBar(context: Context, bottomNavigationView: BottomNavigationView){
    bottomNavigationView.setOnItemSelectedListener{ menuItem->
        when(menuItem.itemId){
            R.id.nav_home ->{
                val intent = Intent(context, HomeActivity::class.java)
                context.startActivity(intent)
                true
            }
            R.id.nav_acc->{
                val intent = Intent(context, AccountActivity::class.java)
                context.startActivity(intent)
                true
            }
            R.id.nav_search->{
                val intent = Intent(context, SearchActivity::class.java)
                context.startActivity(intent)
                true
            }
            R.id.nav_add->{
                val intent = Intent(context, AddActivity::class.java)
                context.startActivity(intent)
                true
            }
            R.id.nav_notif->{
                val intent = Intent(context, NotificationActivity::class.java)
                context.startActivity(intent)
                true
            }
            else -> false
        }
    }
}