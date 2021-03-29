package com.britishbroadcast.dependencyinjection101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.britishbroadcast.dependencyinjection101.util.ApplicationSingletonK
import com.britishbroadcast.dependencyinjection101.util.DebugLogger
import com.britishbroadcast.dependencyinjection101.util.MessageToaster
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    val debugLogger = DebugLogger()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //an error occurs
        debugLogger.logError("An error occurred...")
    }


    fun updateRecyclerViewWithBookList() {
        //update recyclerview
    }
}
