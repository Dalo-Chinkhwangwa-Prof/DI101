package com.britishbroadcast.dependencyinjection101.di.component

import com.britishbroadcast.dependencyinjection101.MainActivity
import com.britishbroadcast.dependencyinjection101.di.module.DIModule
import com.britishbroadcast.dependencyinjection101.util.DebugLogger
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DIModule::class])
interface DIComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(debugLogger: DebugLogger)
}