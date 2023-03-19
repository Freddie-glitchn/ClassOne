
//you create a constructor by just adding brackets after className
class PersonClass (_firstName: String, _lastName: String, _age: Int, _pAddress: String, val school: String, val course: String = "ComputerScience"){
    //you can also initialize property at the constructor i.e val school: String
    //defining property for class
    val firstName: String
    val lastName: String

    //initializing by joining assignment
    val age: Int = _age
    val pAddress: String = _pAddress

    //initializing property using init block
    init {
        firstName = _firstName
        lastName = _lastName

        println("Init 1")
    }

    //Creating secondary constructor. we use a semicolon to call thru to primary constructor
    constructor(): this("Fred", "Kyalo", 27, "Yala", "Bamburi"){
        println("Secondary constructor")
    }

    init {
        println("Init 2")
    }
}
