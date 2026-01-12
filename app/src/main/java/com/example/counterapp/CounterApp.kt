package com.example.counterapp

import android.app.Application
import com.example.counterapp.di.dataModule
import com.example.counterapp.di.domainModule
import com.example.counterapp.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CounterApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@CounterApp)
            androidLogger(Level.INFO)
            modules(
                dataModule,
                domainModule,
                presentationModule
            )
        }
    }
}
