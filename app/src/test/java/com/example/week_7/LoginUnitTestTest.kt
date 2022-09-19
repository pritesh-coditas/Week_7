package com.example.week_7

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class LoginUnitTestTest{

    @Test
    fun validLogin(){
        val result = LoginUnitTest.validUserInput("Pritesh","admin@123")
        assertThat(result).isTrue()
    }

}