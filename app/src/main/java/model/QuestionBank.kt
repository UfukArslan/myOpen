package model

import java.util.*

public class QuestionBank(mQuestionList: List<Question>, mNextQuestionIndex: Int = 0) {


    var mQuestionList: List<Question> = mQuestionList
        get(){ Collections.shuffle(mQuestionList); return field}

    var mNextQuestionIndex: Int = mNextQuestionIndex
        get(){
            // Ensure we loop over the questions
            if (mNextQuestionIndex == mQuestionList.size) {
                mNextQuestionIndex = 0
            }

            // Please note the post-incrementation
            return mQuestionList[mNextQuestionIndex++]
        }

}

