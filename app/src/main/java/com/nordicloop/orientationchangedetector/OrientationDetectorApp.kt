package com.nordicloop.orientationchangedetector

import android.app.Application
import android.content.Intent
import android.content.IntentFilter
import timber.log.Timber




class OrientationDetectorApp: Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        val intentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_CONFIGURATION_CHANGED)
        registerReceiver(ConfigurationIntentReceiver(), intentFilter)
    }
}