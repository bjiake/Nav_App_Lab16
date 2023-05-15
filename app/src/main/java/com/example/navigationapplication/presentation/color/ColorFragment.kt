package com.example.navigationapplication.presentation.color

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.navigationapplication.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ColorFragment : Fragment(R.layout.fragment_color) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPagerInit()
    }

    private fun viewPagerInit() {
        val colorsAdapter = ColorsAdapter(this)
        val viewPager: ViewPager2 = requireView().findViewById(R.id.vpColors)
        viewPager.adapter = colorsAdapter
        val tabLayout: TabLayout = requireView().findViewById(R.id.tlColors)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = if (position == 0) getString(R.string.red) else getString(R.string.white)
        }.attach()
    }
}


