package model

class User(mFirstName: String) {

    var mFirstName: String = mFirstName
        get() { println("User=$mFirstName"); return field}
        set(value) {println("User is setting his firstname."); field = value}
}