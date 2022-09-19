package com.example.week_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.week_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user_name = binding.userNameET.text
        val user_password = binding.passwordET.text

        binding.loginBtn.setOnClickListener {
            if (LoginUnitTest.validUserInput(user_name.toString(),user_password.toString())) {
                startActivity(Intent(this, LoginSuccessActivity::class.java))
            }
            else{
                Toast.makeText(this,"check your login details",Toast.LENGTH_SHORT).show()
            }
        }
    }
}