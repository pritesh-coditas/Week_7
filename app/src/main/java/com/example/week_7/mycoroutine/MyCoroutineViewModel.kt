package com.example.week_7.mycoroutine

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCoroutineViewModel : ViewModel() {
    private val TAG = "MyCoroutineViewModel"

    private var _countValue = MutableLiveData<Int>()
    var countValue: LiveData<Int> = _countValue
    var milli: Long = 30000 // 30 sec
    //lateinit var timer: CountDownTimer

    fun increaseFun() {
        object : CountDownTimer(milli, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                _countValue.postValue((millisUntilFinished / 1000).toInt())
                countValue = _countValue
            }

            override fun onFinish() {
                cancel()
            }
        }.start()
    }
}