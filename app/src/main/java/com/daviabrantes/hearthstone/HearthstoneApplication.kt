package com.daviabrantes.hearthstone

import android.app.Application
import com.daviabrantes.hearthstone.di.networkModule
import com.daviabrantes.hearthstone.di.presenterModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class HearthstoneApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@HearthstoneApplication)
            modules(listOf(networkModule, presenterModule))
        }
    }
}