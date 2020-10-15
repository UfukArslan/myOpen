package com.example.myopen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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

        mNameInput.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                mPlayButton.isEnabled = s.toString().isNotEmpty()
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })


    }
}

gi




