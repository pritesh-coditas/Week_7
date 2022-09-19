package com.example.week_7

object LoginUnitTest {

    private val listOfEmployee = listOf("Sanskar", "Samiksha","Pritesh","Neeraj")
    private var defaultPassword = "admin@123"

    fun validUserInput(userName: String, password: String): Boolean {

        if(userName.isNotEmpty() && userName in listOfEmployee &&
            password == defaultPassword
        ) {
            return true
        }

        return false

    }
}