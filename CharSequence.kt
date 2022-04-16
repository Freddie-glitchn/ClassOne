fun main() {
//    var a = Person("Mary")
//    var c = Person("Mary")
//
//    println(a !== c)

//    var name:String? = "Marry"
//    name = null
//
//    var age:Int? = 28
//    age = null

//    var myName: String = "Monica"
//    val length = myName.length
//
//    println(length)

//    var myName:String? = "Monica"
//    var length = myName?.length
//
//    var length1 = if (myName != null) myName.length else 0
//
//    println(length)
//    println(length1)
//
//    var length2 = myName?.substring(1,3)?.length
//    println(length2)
//
//    var length3 = myName?.substring(0,5)?.drop(2)?.substring(2,3)?.length
//    println(length3)

//    var lastName:String? = "Daniel"
//    var length: Int = if (lastName != null) lastName?.length else 0
//    println(length)



//    helloWorld()
    helloBart()
    elvisOperator()
}
//class Person(var name:String)
fun helloBart(){

    println("Hello Bart")
    ans()
    println("Hello Quagmire")
    qans()
}
fun ans(){
    println("Aye Caramba")
}
fun qans(){
    println("Giggidy giggity goo")
}
fun elvisOperator(){
    //elvis operator
    var lastName:String? = "Daniel"
    val length1:Int = lastName?.substring(0,2)?.length?:0

    println(length1)
}