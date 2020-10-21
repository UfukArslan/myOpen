package model

import java.util.*

class QuestionBank(asList: MutableList<Question>) {

    private var mQuestionList: List<Question>? = null
    private var mNextQuestionIndex = 0

    fun QuestionBank(questionList: List<Question>?) {
        mQuestionList = questionList

        // Shuffle the question list
        Collections.shuffle(mQuestionList)
        mNextQuestionIndex = 0
    }

    fun getQuestion(): Question? {
        // Ensure we loop over the questions
        if (mNextQuestionIndex == mQuestionList!!.size) {
            mNextQuestionIndex = 0
        }

        // Please note the post-incrementation
        return mQuestionList!![mNextQuestionIndex++]
    }
}

