package com.britishbroadcast.dependencyinjection101

import android.app.Application
import com.britishbroadcast.dependencyinjection101.di.component.DIComponent
import com.britishbroadcast.dependencyinjection101.di.component.DaggerDIComponent
import com.britishbroadcast.dependencyinjection101.di.module.DIModule
import com.britishbroadcast.dependencyinjection101.util.ApplicationSingletonK

class DIApplication: Application() {

    lateinit var diComponent: DIComponent

    override fun onCreate() {
        super.onCreate()

        diComponent = DaggerDIComponent.builder()
            .dIModule(DIModule(this))
            .build()

        ApplicationSingletonK.diComponent = diComponent
    }
}