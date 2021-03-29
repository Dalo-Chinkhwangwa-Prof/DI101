package com.britishbroadcast.dependencyinjection101.util

import javax.inject.Inject

class DebugLogger {


    @Inject
    lateinit var messageToaster: MessageToaster

    init {
        ApplicationSingletonK.diComponent.inject(this)
    }

    fun logMessage(message: String){
        messageToaster.toastMessage("Log: $message")
    }

    fun logError(message: String){
        messageToaster.toastMessage("Error: $message")
    }

}