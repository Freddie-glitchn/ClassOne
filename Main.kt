fun main() {
    var name:String = "rain"

    println(name)

    name = "thunder"
    println(name.capitalize())
    println(name.length)

    name = ""
    println(name.isEmpty())

    val myInt = 1_000_000_000
    println(myInt)

    var mess = """
        Hello pals,
        how y'all been?
        It's a nice weather outside!
    """.trimIndent()
    println(mess)
}