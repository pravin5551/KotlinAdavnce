package com.pravin.kotlinrevision.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class CoroutineExamples {

}

fun main() = runBlocking {

    println("Start of program")
    for (i in 0..10) {
        println("Printing $i .")
        delay(1000)
    }

    println("End of program")
}