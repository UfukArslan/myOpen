package model

import android.util.Log
import java.util.*

public class QuestionBank(mQuestionList: List<Question>) {

    private var mNextQuestionIndex = 0

    var mQuestionList: List<Question> = mQuestionList
        get(){ Collections.shuffle(field); return field}



    public fun getQuestion(): Question {

        if(mNextQuestionIndex == mQuestionList.size) mNextQuestionIndex = 0

        return mQuestionList[mNextQuestionIndex++]



    }


}


