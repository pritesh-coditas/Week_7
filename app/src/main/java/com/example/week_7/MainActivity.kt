package com.example.week_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.week_7.databinding.ActivityMainBinding
import com.example.week_7.my_integration_espresso.MyEspressoActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userName = binding.userNameET.text
        val userPassword = binding.passwordET.text

        binding.loginBtn.setOnClickListener {
            if (LoginUnitTest.validUserInput(userName.toString(),userPassword.toString())) {
                startActivity(Intent(this, LoginSuccessActivity::class.java))
            }
            else{
                Toast.makeText(this,"check your login details",Toast.LENGTH_SHORT).show()
            }
        }
        binding.gotoEspressoActivityBtn.setOnClickListener{
            startActivity(Intent(this,MyEspressoActivity::class.java))
        }
    }
}