


fun main()
{
    val person = PersonClass() //("Fred", " Ng'ara", 27, "3900 Moi University", "Moi University")
    //accessing personclass properties without the need of getters
    person.age
    person.pAddress
    person.firstName
    person.school

    val pClass2 = personClass2()
    pClass2.nickName = "Ngizi"
    pClass2.nickName = "New Nickname"
    println(pClass2.nickName)
}