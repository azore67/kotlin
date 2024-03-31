package dataclasses

data class UserData(val name:String, val age: Int)

fun main() {
    val user1 = UserData("Atharva", 19)
    val user2 = UserData("Atharvaa", 20)

//    hashcode(),equals(),copy(),tostring
    println(user1 == user2)
    println(user1.hashCode() == user2.hashCode())
    println(user1.hashCode())
    println(user2.hashCode())
    val user3 = user1.copy(age = 22)
    println(user3.toString())

}