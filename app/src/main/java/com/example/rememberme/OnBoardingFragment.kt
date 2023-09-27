package com.example.rememberme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.rememberme.databinding.FragmentOnBoardingBinding
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingFragment : Fragment(R.layout.fragment_on_boarding) {

    private lateinit var mBinding: FragmentOnBoardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boardList = BoardListProvider.getData(requireContext())
        val adapter = OnBoardingViewPagerAdapter(boardList, ::onClick)
        mBinding = FragmentOnBoardingBinding.bind(view).apply {
            viewPager.adapter = adapter
        }
        setupTabLayout()
    }

    private fun setupTabLayout() {
        TabLayoutMediator(mBinding.viewPagerTab, mBinding.viewPager) { _, _ ->
        }.attach()
    }

    private fun onClick() {
        val action = OnBoardingFragmentDirections.actionOnBoardingToMenu()
        findNavController().navigate(action)
    }
}
