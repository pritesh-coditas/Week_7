package com.example.week_7.my_integration_espresso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week_7.databinding.ActivityMyEspressoBinding

class MyEspressoActivity : AppCompatActivity() {

    lateinit var binding:ActivityMyEspressoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyEspressoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gotoSecondActivityBtn.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }

    }
}