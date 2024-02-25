package com.pravin.kotlinrevision.coroutine

import kotlinx.coroutines.*

class CoroutineShekhar {


}

fun main() = runBlocking {
    asynLaunch()
    constExample()
}

fun constExample() {
    var  nameOfUser = CONSTANT.name
}



suspend fun asynLaunch(){
    val job = GlobalScope.launch(Dispatchers.Default) {

    }
    job.join()

    val deffered = GlobalScope.async(Dispatchers.IO) {

        var sum = 12-21
        return@async sum
    }
    val asynObj = deffered.await()
}