package com.example.sixthmonthhw_3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class Adapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ButtonsFragment()
            1 -> CountFragment()
            2 -> StoryFragment()
            else -> ButtonsFragment()
        }
    }
}