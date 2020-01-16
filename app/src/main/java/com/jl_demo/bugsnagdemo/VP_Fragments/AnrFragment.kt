package com.jl_demo.bugsnagdemo.VP_Fragments

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jl_demo.bugsnagdemo.MainActivity
import com.jl_demo.bugsnagdemo.R
import kotlinx.android.synthetic.main.fragment_anr.view.*

class AnrFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_anr, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            anr_launch_btn.setOnClickListener {
                triggerANR()
            }
        }
    }


    fun triggerANR(){
//        makeItDummyProof()
        while(true) {
            //This is such a bad idea....
        }
    }

//    fun makeItDummyProof(){
//        Handler().postDelayed({
//            (activity as MainActivity).finish()
//        }, 10000)
//    }
}