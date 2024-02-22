package com.pravin.kotlinrevision.dsa

class DataStructure {
}

fun main() {
    //immutable collection
    var list = listOf(4,5,3, "Pravin")

    println(list.toString())

    list.forEach {
        println(it)
    }

    //mutable collection
    var mutableList  = mutableListOf(2, 3,0 ,4,5,6,67,8,9)
    mutableList[2] = 5551
    for (item in mutableList){
        println(item)
    }

    var listOfInt = listOf(23,3)

    mutableList.addAll(listOfInt)
    for (item in mutableList){
        println(item)
    }
}