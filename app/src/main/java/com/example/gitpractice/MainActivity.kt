package com.example.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my first commit")
        println("Changed from second user")
        println("Changed from branch1")
        println("Changed from branch2")
        println("Another Changed from branch2")


    }
}