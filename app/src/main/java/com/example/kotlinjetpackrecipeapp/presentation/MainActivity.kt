package com.example.kotlinjetpackrecipeapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinjetpackrecipeapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private final val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}