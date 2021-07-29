package com.example.kotlinlesson

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinlesson.data.PDCopy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val copy = PDCopy.pdCopy

        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = copy.name + " " + copy.surname + " " + copy.age.toString()
        }
    }
}