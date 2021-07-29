package com.example.kotlinlesson.data

data class PersonalData(val name: String, val surname: String, val age: Int)

val person = PersonalData("Tom", "Black", 21)

object PDCopy {

    val pdCopy = person.copy(age = 8)
}