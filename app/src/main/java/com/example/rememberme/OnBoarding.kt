package com.example.rememberme

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import com.example.rememberme.databinding.FragmentOnBoardingBinding
import com.google.android.material.tabs.TabLayoutMediator

class OnBoarding : Fragment(R.layout.fragment_on_boarding), ViewPagerOnClickListener {

    private lateinit var mBinding: FragmentOnBoardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boardList = BoardListProvider.getData(requireContext())
        val adapter = OnBoardingViewPagerAdapter(boardList, this)
        mBinding = FragmentOnBoardingBinding.bind(view).apply {
            viewPager.adapter = adapter
        }
        setupTabLayout()
    }

    private fun setupTabLayout() {
        TabLayoutMediator(mBinding.viewPagerTab, mBinding.viewPager) { _, _ ->
        }.attach()
    }

    override fun onClick() {
        // TODO: Navigation
    }
}
