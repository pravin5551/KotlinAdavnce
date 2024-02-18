package com.pravin.kotlinrevision.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/**
 * Coroutine builders
 * launch, runBlocking, async
 */

/** difference between launch and GlobalScope.launch
 * launch is launched locally, and GlobalScope.launch creates the instance globally, so it is top=level coroutines and can survive the entire life of application
 */


fun main() {

    //Create coroutine at global scope(app level) - use wisely because if you create and forget the instance then it will consume a lot memory
    GlobalScope.launch {
        //File download/upload
        //Play music
        //Network api cal
        //Image loading
    }

    //Create coroutine at local scope


}

