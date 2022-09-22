package com.example.week_7.mythread

import android.util.Log
import kotlin.concurrent.thread

class MyThreadClass:Thread() {
    private val logVariable = "thread"

    override fun run() {
        for(i in 0 until 5){
            Log.d(logVariable,"$i")
            Thread.sleep(1000)
        }
    }

}