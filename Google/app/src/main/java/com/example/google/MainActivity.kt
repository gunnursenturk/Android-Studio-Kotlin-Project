package com.example.google

import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView5 = findViewById(R.id.textView5) as TextView
        textView5.setOnClickListener {
            val intent= Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
    }
    fun yazdir (view: View)
    {
        //val uyari=AlertDialog.Builder


    }
    fun activityChance (view: View)
    {

    }
}
