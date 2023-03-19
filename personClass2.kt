class personClass2 ( val firstName: String = "Bruce", val lastName: String = "Banner"){
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    fun printInfo(){
        //?: is known as the elvis operator. checks the left side to see if its null then return what is on the other side of the expression
        val nickNameToPrint = nickName ?: "no nickname"
        //val nickNameToPrint = if (nickName != null) nickName else "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}