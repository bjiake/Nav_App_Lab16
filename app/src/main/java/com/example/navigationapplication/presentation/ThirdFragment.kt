package com.example.navigationapplication.presentation

import android.widget.Toast
import com.example.navigationapplication.R

class ThirdFragment : BaseFragment(R.layout.third_fragment) {
    override val buttonId: Int
        get() = R.id.btNext

    override fun onClick() {
        Toast.makeText(context, "Last fragment", Toast.LENGTH_SHORT).show()
    }
}
