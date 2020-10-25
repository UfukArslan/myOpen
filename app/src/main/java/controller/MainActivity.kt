package controller

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myopen.R
import model.User


class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    private lateinit var mGreetingText: TextView
    private lateinit var mNameInput: EditText
    private lateinit var mPlayButton: Button
    private lateinit var mUser: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("TAG", "MainActivity::onCreate")



        mGreetingText =  findViewById<TextView>(R.id.activity_main_greeting_txt)
        mNameInput = findViewById<EditText>(R.id.activity_main_name_input)
        mPlayButton =  findViewById<Button>(R.id.activity_main_play_btn)

        mPlayButton.isEnabled = false

        mNameInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                mPlayButton.isEnabled = s.toString().isNotEmpty()
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })


        mPlayButton.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View?) {
                Log.i("TAG", "MainActivity::PlayButtonClick")
                val gameActivity = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(gameActivity)

            }
        })

    }
}












