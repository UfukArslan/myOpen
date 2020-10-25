package model

import android.util.Log
import controller.MainActivity
import java.util.*

public class QuestionBank(mQuestionList: List<Question>) {

    private val TAG = MainActivity::class.java.simpleName
    private var mNextQuestionIndex = 0

    var mQuestionList: List<Question> = mQuestionList
        get(){ Collections.shuffle(field); Log.i("TAG", "QuestionBank::mQuestionList.get(shuffle)"); return field}



    public fun getQuestion(): Question {

        if(mNextQuestionIndex == mQuestionList.size) mNextQuestionIndex = 0

        return mQuestionList[mNextQuestionIndex++]



    }


}


