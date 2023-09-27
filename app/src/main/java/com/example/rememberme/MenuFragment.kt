package com.example.rememberme

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.rememberme.databinding.FragmentMenuBinding

class MenuFragment : Fragment(R.layout.fragment_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navHostFragment = requireActivity()
//            .supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
//
//        val binding = FragmentMenuBinding.bind(view).apply {
//            NavigationUI.setupWithNavController(bottomNavigationView, navController)
//        }
    }
}
