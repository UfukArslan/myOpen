package model

import java.util.*

public class QuestionBank(mQuestionList: List<Question>) {

    private var mNextQuestionIndex = 0

    var mQuestionList: List<Question> = mQuestionList
        get(){ Collections.shuffle(mQuestionList); return field}


    public fun getQuestion(): Question {

        if(mNextQuestionIndex == mQuestionList.size) mNextQuestionIndex = 0

        return mQuestionList[mNextQuestionIndex++]

    }

}

git