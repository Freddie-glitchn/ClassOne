//fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun sayHello(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach{ itemToGreet->
        println("$greeting $itemToGreet")
    }
}


fun main() {


    //interestingThing is non-mutable. we cant add things to it
    //val interestingThing = listOf<String>("Kotlin", "Java", "Android Studio")

    //mutable interestingThing
//    val interestingThing = mutableListOf<String>("Kotlin", "Java", "Android Studio")
//    interestingThing.add("Python")



    //non-mutable map
    //val map = mapOf(1 to "a", 2 to "b", 3 to "c")



    //mutable map
//    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//    map.put(4, "d")
//    map.forEach{key, value -> println("$key -> $value") }


//    val interestingThing = listOf("Kotlin", "Java", "Android Studio")
//    sayHello("Hi", "Kotlin", "Java", "Android Studio")



    val interestingThing = arrayOf("Kotlin", "Java", "Android Studio")
    sayHello("Hi", *interestingThing)

}
