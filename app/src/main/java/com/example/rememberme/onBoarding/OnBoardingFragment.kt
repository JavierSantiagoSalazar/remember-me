package com.example.rememberme.onBoarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rememberme.R
import com.example.rememberme.common.setBottomNavigationVisibility
import com.example.rememberme.databinding.FragmentOnBoardingBinding
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingFragment : Fragment(R.layout.fragment_on_boarding) {

    private lateinit var mBinding: FragmentOnBoardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().setBottomNavigationVisibility(R.id.bottomNavigationView, View.GONE)

        val boardList = BoardListProvider.getData(requireContext())
        val adapter = OnBoardingViewPagerAdapter(boardList, ::onContinueClick)
        mBinding = FragmentOnBoardingBinding.bind(view).apply {
            viewPager.adapter = adapter
        }
        setupTabLayout()
    }

    private fun setupTabLayout() {
        TabLayoutMediator(mBinding.viewPagerTab, mBinding.viewPager) { _, _ ->
        }.attach()
    }

    private fun onContinueClick() {
        val action = OnBoardingFragmentDirections.actionOnBoardingToMenu()
        findNavController().navigate(action)
    }
}
