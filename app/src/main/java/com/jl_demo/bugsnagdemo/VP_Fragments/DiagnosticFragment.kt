package com.jl_demo.bugsnagdemo.VP_Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jl_demo.bugsnagdemo.R
import kotlinx.android.synthetic.main.fragment_diagnosis.view.*

class DiagnosticFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_diagnosis, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            diag_launch_btn.setOnClickListener {
                Toast.makeText(activity!!, "Not done with this yet...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}