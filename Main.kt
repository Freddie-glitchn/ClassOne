//null variables need a question mark introduced to it
var greeting: String? = null

val greetings: String = "Hello "

fun greetin(){
    val name = "Fred"
    var greeting: String? = null

    greeting = "What up "
    val printGreeting = if (greeting != null) greeting else "Hello"
    println(printGreeting + name)
}

fun greetins(){
    val name = "Fred"
    var greeting: String? = null

    //greeting = "What up "
    val printGreeting = when (greeting ){
        null -> "Wowzers, "
        else -> greeting
    }
    println(printGreeting + name)
}

fun main(args: Array<String>) {


//    greeting = " How you doin?"
    val name: String = "Fred "
    var lastName: String = "Ng'ara"
    lastName += " Kyalo!"

    if (greeting != null)
        println(greeting)
    else
        println(greetings + name + lastName)

    when(greeting)
    {
        //we use -> to define what action to take
        null -> println("How you doin")
        else -> println(greeting)
    }

    //arrays
    val items = arrayOf("Kotlin", "Java", "Python", "C#")
    println(items.size)
    println(items[1])
    println(items.get(0))

    //convenient syntax of for loops in kotlin iterating each value of an array
    for (item1 in items){
        println(item1)
    }

    //invoking a for each function and takes in another function and return Unit
    items.forEach {item1 ->
        //printing each item in an array
        //println(it)    or....
        println(item1)
    }

    items.forEachIndexed { index, item1 ->
        println("$item1 is at index $index")
    }

    greetin()
    greetins()
    SayHello()
    println(getMe())
    println(sayName())
    holla(itemToGreet = "Wadawida")
//    println(fetchGreeting())
}

//Basic functions
//we use fun to define a method i.e fun methodName
//e.g 1. Return type method
fun fetchGreeting(): String{
    return "Hello Kyalo"
}

//non-return type method
fun SayHello(){
    println(fetchGreeting())
}

//null methods
fun getMe(): String?{
    return null
}

//single expression method
fun sayName() = "Fred Ng'ara Kyalo"

//defining function parameter
fun holla(itemToGreet: String){
    val msg = "Hello " + itemToGreet
    println(msg)
}

//defining templated value
//use dollar sign to add templated value to another string
fun halla(itemToGreet: String){
    val msg = "Hello $itemToGreet"
    println(msg)
}