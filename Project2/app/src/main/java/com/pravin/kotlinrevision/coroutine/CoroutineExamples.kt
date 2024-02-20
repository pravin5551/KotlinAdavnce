package com.pravin.kotlinrevision.coroutine

import kotlinx.coroutines.*

class CoroutineExamples {

}

fun main() = runBlocking {

    println("Start of program")

    val job: Job =  GlobalScope.async {
        for (i in 0..10) {
            println("Printing $i .")
            delay(1000)
        }
    }


    job.join()

    for (i in 10..20) {
        println("Printing $i .")
        delay(1000)
    }
    println("End of program")
}