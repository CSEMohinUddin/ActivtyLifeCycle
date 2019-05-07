package com.example.opennewactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name=intent.getStringExtra("Name")
        val email=intent.getStringExtra("Email")
        val number=intent.getStringExtra("Number")
        tvShowing.text="Name: "+name+"\nEmail:"+email+"\nNumber: "+number
    }
}
