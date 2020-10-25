package model

import android.util.Log
import controller.MainActivity

class Question(var mQuestion: String, mChoiceList: List<String>, mAnswerIndex: Int){

    private val TAG = MainActivity::class.java.simpleName

    var mChoiceList: List<String> = mChoiceList
        get() { Log.i("TAG", "Question::mChoiceList.get"); return field}
        set(value) {
            if (value == null) {
                throw IllegalAccessException("Array cannot be null")
                                }
            field = value
        }


    var mAnswerIndex: Int = mAnswerIndex
        get(){Log.i("TAG", "Question::mAnswerIndex.get"); return field}
        set(value) {
            if (value < 0 || value >= mChoiceList.size ) {
                throw IllegalAccessException("Answer index is out of bound")
                }
            field = value
        }


}






