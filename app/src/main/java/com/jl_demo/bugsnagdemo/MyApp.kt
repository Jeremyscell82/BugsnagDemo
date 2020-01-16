package com.jl_demo.bugsnagdemo

import android.app.Application
import com.bugsnag.android.Bugsnag

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Bugsnag.init(this)

        //Add information before any bugs are created, to be sent on every report
        Bugsnag.beforeNotify { error ->
            // Attach customer information to every error report
            error.addToTab("myDemo", "name", "Arrow")
            error.addToTab("myDemo", "paying_customer", true)
            true
        }
        Bugsnag.setUser("123456789", "useremail@email.com", "User Name")
    }
}