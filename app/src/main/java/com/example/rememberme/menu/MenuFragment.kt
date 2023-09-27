package com.example.rememberme.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.rememberme.R
import com.example.rememberme.common.setBottomNavigationVisibility
import com.example.rememberme.databinding.FragmentMenuBinding

class MenuFragment : Fragment(R.layout.fragment_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().setBottomNavigationVisibility(R.id.bottomNavigationView, View.VISIBLE)
        val binding = FragmentMenuBinding.bind(view).apply {
        }
    }
}
