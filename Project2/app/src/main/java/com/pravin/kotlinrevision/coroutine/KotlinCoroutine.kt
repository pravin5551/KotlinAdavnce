package com.pravin.kotlinrevision.coroutine

import kotlinx.coroutines.CoroutineScope
import kotlin.concurrent.thread


fun main() {
    println("Hi from kotlin")


    println("Start of ${Thread.currentThread().name} thread")


    thread {
        println("Dummy work start on ${Thread.currentThread().name} thread")
        Thread.sleep(1000)
        println("Dummy work ends on ${Thread.currentThread().name} thread")
    }



    println("End of ${Thread.currentThread().name} thread")

    thread {


        println("Dummy work start on ${Thread.currentThread().name} thread")
        Thread.sleep(1000)

        println("Dummy work ends on ${Thread.currentThread().name} thread")


    }

//    CoroutineScope(Cor)
}
