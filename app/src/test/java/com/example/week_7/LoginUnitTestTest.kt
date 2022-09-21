package com.example.week_7

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class LoginUnitTestTest{

    @Test
    fun emptyUserName(){
        val result = LoginUnitTest.validUserName("","admin@123")
            assertThat(result).isTrue()
    }

    @Test
    fun emptyPassword(){
        val result = LoginUnitTest.validUserPassword("Neeraj","")
            assertThat(result).isTrue()

    }

    @Test
    fun passwordMissMatch(){
        val result = LoginUnitTest.passwordIncorrect("Sanskar","admin123")
            assertThat(result).isTrue()
    }

    @Test
    fun userNotExists(){
        val result = LoginUnitTest.userNotFound("Shubham","shubham123")
            assertThat(result).isFalse()
    }
    // empty user name
    // password incorrect
    // user not exists
    // empty password

}