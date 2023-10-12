package com.example.rememberme.ui.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.rememberme.R
import com.example.rememberme.databinding.FragmentMenuBinding
import com.example.rememberme.ui.common.setBottomNavigationVisibility

class MenuFragment : Fragment(R.layout.fragment_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().setBottomNavigationVisibility(R.id.bottomNavigationView, View.VISIBLE)
        val binding = FragmentMenuBinding.bind(view).apply {
        }
    }
}
