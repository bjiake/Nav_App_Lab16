package com.example.navigationapplication.presentation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

abstract class BaseFragment(layoutResId: Int) : Fragment(layoutResId) {
    abstract fun onClick()
    abstract val buttonId: Int
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireView().findViewById<Button>(buttonId).setOnClickListener {
            onClick()
        }
    }
}