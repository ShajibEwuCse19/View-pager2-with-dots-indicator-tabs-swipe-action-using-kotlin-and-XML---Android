package com.example.viewpagerpractice2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * @author Shajib
 * @since Jul 09, 2024
 **/
class FragmentPageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 2 //two fragments
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)FirstFragment() else SecondFragment()
    }

}