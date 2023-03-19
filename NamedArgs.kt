
fun sHello(greeting: String, vararg itemsToGreet: String)
{
    itemsToGreet.forEach{ itemToGreet->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")
//fun greetPerson(greeting: String, name: String) = println("$greeting $name")

fun main()
{
    greetPerson( "hi", "Freddie")
    greetPerson(greeting = "hi", name = "Freddie")
    greetPerson(name = "Kyalo")
    greetPerson()


    val  interestingThing = arrayOf("Kotlin", "Python", "Java")
    sHello("Hi", *interestingThing)
    //named argument syntax
    sHello(greeting = "hello", itemsToGreet = *interestingThing)
}