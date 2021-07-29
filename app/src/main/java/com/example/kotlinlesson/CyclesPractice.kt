package com.example.kotlinlesson

fun main() {
    println(max)

    when (2){
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
    }

    when (8){
        !in 1..7 -> println("number outside the range 1..7")
        //!in 1..10 -> println("number in the range 1..10")
        //in 1..10 -> println("in the range")
    }

    var someList: List<String> = listOf("one", "two", "three")

    for (s in someList.indices){
        println(someList[s])
        println(s)
/*        if (s == "two")
            println(2)*/
    }

    for ((index, value) in someList.withIndex()) {
        println("the element at $index is $value")
    }
}

var max: Int = max(8,7)

fun max(a: Int, b: Int): Int {

    if (a > b)
        max = a
    else
        max = b

    return max
}
