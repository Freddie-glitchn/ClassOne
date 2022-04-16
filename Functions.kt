fun main(){
    var x = wazup()
    println(x)

    var y = helloWorld()
    println(y)

    wazup()
    helloWorld()
    alsoLikeThis()

    val miaka = 21

    fun access(){
        if (miaka <25){
            println("No acces")
        }else{
            println("Umekomaa")
        }
    }
    access()
}
fun wazup(){
    println("Waaazuup")
    fun what(){
        println("What!Stop shout'n")
    }
    what()
}
fun helloWorld():String{
    return "Hello World"
}
fun alsoLikeThis() = println("No way! This also works")