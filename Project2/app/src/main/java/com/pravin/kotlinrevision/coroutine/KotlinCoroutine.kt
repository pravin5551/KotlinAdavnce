package com.pravin.kotlinrevision.coroutine

import kotlinx.coroutines.*



fun main() = runBlocking {
    println("Hi from kotlin")


    println("Starts on ${Thread.currentThread().name} thread")


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

    /**
     * launch should always be called from any coroutine builder
     */
    val job: Job = launch {
        println("inside launch")

        var number = 8 * 9;
        print("Number is $number")
    }

    //instead of stopping the thread just use job.join() and it will wait till the job is completed and then run the rest of the code
    job.join()

    // this cancels the job execution
//    job.cancel()
    /*this will block the thread and not let the thread to to do anything */
//    Thread.sleep(2000)
    /**
     * Same like Thread.sleep(2000) but in coroutine
     *
     */


    runBlocking {
        delay(5000)
    }

    //or
    GlobalScope.launch {
        mySuspendFun(1, "lol")
    }
    println("Ends on ${Thread.currentThread().name} thread")


//    launch {
//        println("This is ${Thread.currentThread().name} thread")
//    }
}


//Suspend should always be called from another suspend ort from coroutine builder
suspend fun mySuspendFun(l: Int, p: String) {
    delay(5000)
}

