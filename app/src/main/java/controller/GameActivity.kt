package controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myopen.R

class GameActivity : AppCompatActivity() {

    private lateinit var gGreetingText: TextView
    private lateinit var gAnswer1Button: Button
    private lateinit var gAnswer2Button: Button
    private lateinit var gAnswer3Button: Button
    private lateinit var gAnswer4Button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        gGreetingText =  findViewById<TextView>(R.id.activity_game_question_text)
        gAnswer1Button =  findViewById<Button>(R.id.activity_game_answer1_btn)
        gAnswer2Button =  findViewById<Button>(R.id.activity_game_answer2_btn)
        gAnswer3Button =  findViewById<Button>(R.id.activity_game_answer3_btn)
        gAnswer4Button =  findViewById<Button>(R.id.activity_game_answer4_btn)
    }
}


