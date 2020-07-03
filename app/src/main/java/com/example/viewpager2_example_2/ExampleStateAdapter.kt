package com.example.viewpager2_example_2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2_example_2.fragments.FragmentA
import com.example.viewpager2_example_2.fragments.FragmentB
import com.example.viewpager2_example_2.fragments.FragmentC
import com.example.viewpager2_example_2.fragments.FragmentD

class ExampleStateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    val fragments:ArrayList<Fragment> = arrayListOf(
        FragmentA(),
        FragmentB(),
        FragmentC(),
        FragmentD()
    )


    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}