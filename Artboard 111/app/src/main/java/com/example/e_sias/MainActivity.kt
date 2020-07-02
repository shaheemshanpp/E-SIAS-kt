package com.example.e_sias

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        getActionBar()?.hide()
        getSupportActionBar()?.hide()


    }
}


//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle