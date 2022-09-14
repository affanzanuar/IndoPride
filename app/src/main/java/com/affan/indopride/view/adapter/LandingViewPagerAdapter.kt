package com.affan.indopride.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class LandingViewPagerAdapter (
    private var fragment : ArrayList<Fragment>,
    activity : FragmentActivity
        ) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return fragment.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragment[position]
    }

}