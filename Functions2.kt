fun main(){
    userInfo(name = "Mary", miaka = 27, isHappy = true, likesDrinkin = true)
    userInfo(name = "Monica", miaka = 30, isHappy = true, likesDrinkin = false)
    userInfo("McCoy",
        24,
        false,
        true)
    printInfo("Supreme Magus",
    "NA",
    2000)
}
fun userInfo(name: String, miaka: Int, isHappy: Boolean, likesDrinkin: Boolean){
    println("$name is $miaka. Happy: $isHappy, Is a drunkard: $likesDrinkin")
}
fun printInfo(title:String, author:String, chapter:Int){
    println("$title/n $author/n $chapter")
}