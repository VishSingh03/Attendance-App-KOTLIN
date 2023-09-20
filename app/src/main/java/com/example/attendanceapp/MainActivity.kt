package com.example.attendanceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mark = findViewById<Button>(R.id.ma)
        mark.setOnClickListener {
            val intent = Intent(this, MarkAttendance::class.java)
            startActivity(intent)
        }
        val aggregate = findViewById<Button>(R.id.avg)
        mark.setOnClickListener {
            val intent = Intent(this, Aggregate::class.java)
            startActivity(intent)
        }
    }
}