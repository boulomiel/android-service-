package com.rubenmimoun.serviceexamplekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener { startService() }
        stop.setOnClickListener { stopService() }

    }


    private fun startService(){
        startService(Intent(this,MyService::class.java))
    }

    private fun stopService(){
        stopService(Intent(this, MyService::class.java))
    }
}

