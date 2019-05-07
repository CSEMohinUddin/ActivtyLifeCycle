package com.example.opennewactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave.setOnClickListener {

            val name=etName.text.toString()
            val email=etEmail.text.toString()
            val number=etNumber.text.toString()

            val intent=Intent(this@MainActivity,SecondActivity::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Email",email)
            intent.putExtra("Number",number)
            startActivity(intent)
        }

    }
}
