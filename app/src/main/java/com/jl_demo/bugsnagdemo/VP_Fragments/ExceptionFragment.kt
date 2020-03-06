package com.jl_demo.bugsnagdemo.VP_Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bugsnag.android.Bugsnag
import com.jl_demo.bugsnagdemo.R
import com.rollbar.android.Rollbar
import kotlinx.android.synthetic.main.fragment_exception.view.*
import java.io.IOException
import java.lang.RuntimeException

class ExceptionFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exception, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            exception_launch_btn.setOnClickListener {
                Bugsnag.notify(RuntimeException("Test Runtime exception"))
                Bugsnag.notify(IOException("Test IO Exception"))

                val rollbar: Rollbar = Rollbar.instance() //Getting instance of Rollbar
                rollbar.error(RuntimeException("Test Runtime exception"))
                rollbar.error(IOException("Test IO Exception"))
            }
        }
    }
}