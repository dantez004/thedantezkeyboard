package com.thedantezkeyboard

import android.app.Application
import android.util.Log

class KeyboardApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("KeyboardApp", "Application created")
    }
}