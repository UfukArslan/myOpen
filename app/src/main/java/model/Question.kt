package model

class Question(var mQuestion: String, mChoiceList: List<String>, mAnswerIndex: Int){

    var mChoiceList: List<String> = mChoiceList
        get() {return field}
        set(value) {
            if (value == null) {
                throw IllegalAccessException("Array cannot be null")
                                }
            mChoiceList = value
                    }


    var mAnswerIndex: Int = 0
        get(){return field}
        set(value) {
            if (value < 0 || value >= mChoiceList.size ) {
                throw IllegalAccessException("Answer index is out of bound")
                }
            mAnswerIndex = value
        }


}






