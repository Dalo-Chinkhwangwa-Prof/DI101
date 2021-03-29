package com.britishbroadcast.dependencyinjection101.di.module

import android.content.Context
import com.britishbroadcast.dependencyinjection101.util.MessageToaster
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DIModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideMessageToaster(): MessageToaster = MessageToaster(context)

}