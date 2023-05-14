package com.example.navigationapplication.presentation

import androidx.navigation.fragment.findNavController
import com.example.navigationapplication.R

class FirstFragment : BaseFragment(R.layout.first_fragment) {
    override val buttonId: Int
        get() = R.id.btNext

    override fun onClick() {
        findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
    }
}
