package com.example.kotlinlesson

fun printSome(vararg word: String) {
    println(word)
}

fun main(args: Array<String>){
    printSome("some")
    printSome("some", "any")
    printSome("some", "any", "to")
}

