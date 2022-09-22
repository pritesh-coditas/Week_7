package com.example.week_7.mythread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.week_7.databinding.ActivityMyThreadBinding

class MyThreadActivity : AppCompatActivity() {

    private val threadObj = MyThreadClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMyThreadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.threadActivityBtn1.setOnClickListener{
            threadObj.start()
        }
        binding.threadActivityBtn2.setOnClickListener{
            Toast.makeText(this,"click",Toast.LENGTH_SHORT).show()
        }

    }
}