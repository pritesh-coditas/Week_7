package com.example.week_7

object LoginUnitTest {

    private val listOfEmployee = listOf("Sanskar", "Samiksha","Pritesh","Neeraj")
    private var defaultPassword = "admin@123"

    fun validUserInput(userName: String,userPassword: String):Boolean {
        if (userName.isNotEmpty() && userPassword.isNotEmpty() && listOfEmployee.contains(userName) && defaultPassword == userPassword) {
            return true
        }
        return false
    }

    fun  validUserName(userName: String,userPassword:String):Boolean{
        return userName.isEmpty()
    }

    fun validUserPassword(userName: String,userPassword: String):Boolean{
        return userPassword.isEmpty()
    }
    fun passwordIncorrect(userName: String,userPassword: String):Boolean{
        return defaultPassword != userPassword
    }
    fun userNotFound(userName: String,userPassword: String):Boolean{
        return listOfEmployee.contains(userName)
    }
}