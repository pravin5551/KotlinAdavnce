package com.pravin.kotlinrevision.coroutine

import kotlinx.coroutines.*
import kotlin.concurrent.thread


@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking {
    println("Hi from kotlin")


    println("Starts on ${Thread.currentThread().name} thread")


    /**
     * GlobalScope.launch launches new  coroutine
     */


    /**
     * GlobalScope.launch launches new  coroutine
     */
    GlobalScope.launch {
        println("Dummy work start on ${Thread.currentThread().name} Coroutine1")
//        withContext(Dispatchers.IO) {
        //this will block the thread and not let the thread to to do anything
//            Thread.sleep(2000)
//        }

        //Delay will not block thread it will just delay the work for some time, and let other task do
        delay(1000)
        println("Dummy work ends on ${Thread.currentThread().name} Coroutine1")
    }

    /*this will block the thread and not let the thread to to do anything */
//    Thread.sleep(2000)
    /**
     * Same like Thread.sleep(2000) but in coroutine
     */
    runBlocking {
        delay(2000)
    }
    println("Ends on ${Thread.currentThread().name} thread")

}
