package com.pravin.kotlinrevision.coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.concurrent.thread


fun main() {
    println("Hi from kotlin")


    println("Starts on ${Thread.currentThread().name} thread")


    GlobalScope.launch {
        println("Dummy work start on ${Thread.currentThread().name} Coroutine1")
        withContext(Dispatchers.IO) {
            Thread.sleep(1000)
        }
        println("Dummy work ends on ${Thread.currentThread().name} Coroutine1")
    }

    GlobalScope.launch {
        println("Dummy work ends on ${Thread.currentThread().name} Coroutine2")
        withContext(Dispatchers.IO) {
            Thread.sleep(1000)
        }
        println("Dummy work ends on ${Thread.currentThread().name} Coroutine2")
    }

    println("Ends on ${Thread.currentThread().name} thread")

}
