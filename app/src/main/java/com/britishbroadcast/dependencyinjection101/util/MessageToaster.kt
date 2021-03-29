package com.britishbroadcast.dependencyinjection101.util

import android.content.Context
import android.widget.Toast

class MessageToaster(private val context: Context) {

    fun toastMessage(message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}