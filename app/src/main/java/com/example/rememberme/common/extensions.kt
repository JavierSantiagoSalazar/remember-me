package com.example.rememberme.common

import android.app.Activity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Activity.setBottomNavigationVisibility(bottomNavigation: Int, visibility: Int){
    findViewById<BottomNavigationView>(bottomNavigation).visibility = visibility
}