package com.jl_demo.bugsnagdemo

import android.app.Application
import com.bugsnag.android.Bugsnag

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Bugsnag.init(this)
    }
}