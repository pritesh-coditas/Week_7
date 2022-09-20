package com.example.week_7

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

internal class LoginIntegrateTestTest{

    private lateinit var loginActivityTest:LoginIntegrateTest

    @Before
    fun doInFirst(){
        loginActivityTest = LoginIntegrateTest()
    }

   // @After // doubt?

    @Test
    fun checkFun(){
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = loginActivityTest.checkData(context.getString(R.string.app_name),"Week_7")
        assertThat(result).isTrue()
    }

    @Test
    fun checkFun2(){
        //val context = ApplicationProvider.getApplicationContext<Context>()

        val result = loginActivityTest.checkData("Pritesh","nikam")
        assertThat(result).isTrue()
    }

}