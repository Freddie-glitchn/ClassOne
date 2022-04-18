fun main(){
    var user = user()
    user.fname = "Mercy"
    user.lname = "Muthoka"
    user.printName()
    user.UpdateName("Mathew")
    user.printName()
    user.printWithprefix("Mr.")

    var friend = user()
    friend.fname = "Daniel"
    friend.lname = "Kipchirchir"
    friend.printName()
    friend.updateName("Kyalo")
    friend.printName()
    friend.printWithprefix("Mr.")
}
class user{
    var fname = ""
    var lname = ""

    fun printName(){
        println("$fname $lname")
    }
    fun printWithprefix(prefix:String){
        println("$prefix $fname $lname")
    }
    fun UpdateName(newName:String){
        fname = newName
    }
    fun updateName(newName:String){
        lname = newName
    }
}