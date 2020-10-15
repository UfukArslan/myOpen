package com.example.myopen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var mGreetingText: TextView
    private lateinit var mNameInput: EditText
    private lateinit var mPlayButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mGreetingText =  findViewById<TextView>(R.id.activity_main_greeting_txt)
        mNameInput = findViewById<EditText>(R.id.activity_main_name_input)
        mPlayButton =  findViewById<Button>(R.id.activity_main_play_btn)

        mPlayButton.isEnabled = false
    }
}


