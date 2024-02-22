package com.pravin.kotlinrevision.dsa

fun main() {
    //Immutable map
    var imMap = mapOf(1 to "Pravin", 2 to "Vilas", 3 to "Pawar")

    for (item in imMap.keys){
        print(imMap[item])
    }


    //mutable map
    var mMap = HashMap<Int, String>()

    mMap[1] = "Pravin"
    mMap[2] = "Vilas"
    mMap[5] = "Pawar"
}