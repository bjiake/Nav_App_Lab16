package com.example.navigationapplication.presentation.photo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.navigationapplication.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class PhotosFragment : Fragment(R.layout.fragment_photos) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val photosAdapter = PhotosAdapter(this)
        val viewPager: ViewPager2 = requireView().findViewById(R.id.vpPhotos)
        viewPager.adapter = photosAdapter
        val tabLayout: TabLayout = requireView().findViewById(R.id.tlPhotos)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = if (position == 0) getString(R.string.manul) else getString(R.string.cat)
        }.attach()
    }
}
