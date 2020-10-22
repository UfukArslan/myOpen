package controller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myopen.R
import model.Question
import model.QuestionBank
import java.util.*


class GameActivity : AppCompatActivity() {

    private lateinit var gGreetingText: TextView
    private lateinit var gAnswer1Button: Button
    private lateinit var gAnswer2Button: Button
    private lateinit var gAnswer3Button: Button
    private lateinit var gAnswer4Button: Button

    private lateinit var mQuestionBank: QuestionBank




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var mQuestionBank = generateQuestions()

        gGreetingText =  findViewById<TextView>(R.id.activity_game_question_text)
        gAnswer1Button =  findViewById<Button>(R.id.activity_game_answer1_btn)
        gAnswer2Button =  findViewById<Button>(R.id.activity_game_answer2_btn)
        gAnswer3Button =  findViewById<Button>(R.id.activity_game_answer3_btn)
        gAnswer4Button =  findViewById<Button>(R.id.activity_game_answer4_btn)
    }


    private fun generateQuestions(): QuestionBank? {
        val question1 = Question(
            "What is the name of the current french president?",
            listOf(
                "François Hollande",
                "Emmanuel Macron",
                "Jacques Chirac",
                "François Mitterand"
            ),
            1
        )
        val question2 = Question(
            "How many countries are there in the European Union?",
            listOf("15", "24", "28", "32"),
            2
        )
        val question3 = Question(
            "Who is the creator of the Android operating system?",
            listOf("Andy Rubin", "Steve Wozniak", "Jake Wharton", "Paul Smith"),
            0
        )
        val question4 = Question(
            "When did the first man land on the moon?",
            listOf("1958", "1962", "1967", "1969"),
            3
        )
        val question5 = Question(
            "What is the capital of Romania?",
            listOf("Bucarest", "Warsaw", "Budapest", "Berlin"),
            0
        )
        val question6 = Question(
            "Who did the Mona Lisa paint?",
            listOf("Michelangelo", "Leonardo Da Vinci", "Raphael", "Carravagio"),
            1
        )
        val question7 = Question(
            "In which city is the composer Frédéric Chopin buried?",
            listOf("Strasbourg", "Warsaw", "Paris", "Moscow"),
            2
        )
        val question8 = Question(
            "What is the country top-level domain of Belgium?",
            listOf(".bg", ".bm", ".bl", ".be"),
            3
        )
        val question9 = Question(
            "What is the house number of The Simpsons?",
            listOf("42", "101", "666", "742"),
            3
        )
        return QuestionBank(
            Arrays.asList(
                question1,
                question2,
                question3,
                question4,
                question5,
                question6,
                question7,
                question8,
                question9
            )
        )
    }
}


