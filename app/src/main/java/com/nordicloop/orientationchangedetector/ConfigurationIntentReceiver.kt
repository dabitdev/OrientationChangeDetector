package com.nordicloop.orientationchangedetector

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import timber.log.Timber

class ConfigurationIntentReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_CONFIGURATION_CHANGED) {
            Timber.d("david $intent ${getOrientation(context)}")
        }
    }

    private fun getOrientation(context:Context) : String {
        return when(context.resources.configuration.orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> {
                "landscape"
            }

            Configuration.ORIENTATION_PORTRAIT -> {
                "portrait"
            }
            Configuration.ORIENTATION_UNDEFINED, Configuration.ORIENTATION_SQUARE -> {
                "unknown"
            } else -> "unknown"
        }
    }
}