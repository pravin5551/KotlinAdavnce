package com.pravin.kotlinrevision.dsa

/**
 * We use set when we do not require duplicate entries
 */
class Set {


}

fun main() {
    var immutableSet = setOf(2,3,4,3,"Pravin",4,4,4,5,6,7,8,9,6,7,8,88,88)

//    for(item in immutableSet){
        println(immutableSet)
//    }
    var mutableSet = mutableSetOf(2,3,4,3,"Pravin",4,4,4,5,6,7,8,9,6,7,8,88,88)
    mutableSet.add(22)
    println(mutableSet)

    var immutableMap = HashMap<Int, String>()

}