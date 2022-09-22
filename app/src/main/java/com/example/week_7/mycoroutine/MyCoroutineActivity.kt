package com.example.week_7.mycoroutine

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.week_7.databinding.ActivityMyCoroutineBinding
import kotlinx.coroutines.*

class MyCoroutineActivity : AppCompatActivity() {
    private val TAG = "MyCoroutineActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMyCoroutineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this)[MyCoroutineViewModel::class.java]

        CoroutineScope(Dispatchers.IO).launch {
            Log.d(TAG, Thread.currentThread().name.toString())
        }

        binding.coroutineActivityBtn1.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {
                for(i in 0..10){
                    Log.d(TAG,"$i")
                    delay(2000)
                }
            }

            viewModel.increaseFun()
            viewModel.countValue.observe(this, Observer {
                binding.coroutineActivityTV1.text = it.toString()
            })
        }
    }
}
