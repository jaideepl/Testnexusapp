package com.example.testnexusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.Calculator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt1.text = "${Calculator().add(1, 2)}"
    }
}