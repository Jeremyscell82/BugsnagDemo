package com.jl_demo.bugsnagdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.jl_demo.bugsnagdemo.VP_Fragments.AnrFragment
import com.jl_demo.bugsnagdemo.VP_Fragments.ExceptionFragment
import com.jl_demo.bugsnagdemo.VP_Fragments.DataFeedFragment
import com.jl_demo.bugsnagdemo.VP_Fragments.IntroFragment

class HomeViewpagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager) {

    val homeScreenList: List<Fragment> = listOf(
        IntroFragment(),
        ExceptionFragment(),
        AnrFragment(),
        DataFeedFragment()
    )

    override fun getItem(position: Int): Fragment {
        return homeScreenList[position]
    }

    override fun getCount() = homeScreenList.size


}