fun main(){
    var user = user()
    user.fname = "Mercy"
    user.lname = "Muthoka"

    var friend = user()
    friend.fname = "Daniel"
    friend.lname = "Kipchirchir"
}
class user{
    var fname = ""
    var lname = ""

    fun printName(){
        println("$fname $lname")
    }
}