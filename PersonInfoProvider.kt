interface PersonInfoProvider {
    val providerInfo : String

    fun printInfo(person: personClass2){
        println(providerInfo)
        person.printInfo()
    }
}


class BasicInfoProvider : PersonInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: personClass2) {
        super.printInfo(person)
        println("additional print statement")
    }
}


fun main(){
    val provider = BasicInfoProvider()

    provider.printInfo(personClass2())
}