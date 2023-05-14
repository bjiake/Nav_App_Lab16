package com.example.navigationapplication.presentation

import androidx.navigation.fragment.findNavController
import com.example.navigationapplication.R

class SecondFragment : BaseFragment(R.layout.second_fragment) {
    override val buttonId: Int
        get() = R.id.btNext

    override fun onClick() {
        findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
    }
}
