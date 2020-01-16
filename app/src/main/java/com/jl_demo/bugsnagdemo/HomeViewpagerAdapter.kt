package com.jl_demo.bugsnagdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.jl_demo.bugsnagdemo.VP_Fragments.AnrFragment
import com.jl_demo.bugsnagdemo.VP_Fragments.ExceptionFragment
import com.jl_demo.bugsnagdemo.VP_Fragments.DiagnosticFragment

class HomeViewpagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager) {

    val homeScreenList: List<Fragment> = listOf(
        ExceptionFragment(),
        AnrFragment(),
        DiagnosticFragment()
    )

    override fun getItem(position: Int): Fragment {
        return homeScreenList[position]
    }

    override fun getCount() = homeScreenList.size


}