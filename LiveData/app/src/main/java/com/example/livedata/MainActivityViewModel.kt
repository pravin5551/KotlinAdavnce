package com.example.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(private val startingNum : Int) : ViewModel() {

     var counter = MutableLiveData<Int>();

   init {
       counter.value = startingNum
   }

//    fun getCurrentCount():Int {
//        return counter.value = 0
//    }
    fun updateCount() {
         counter.value = (counter.value)?.plus(1)
    }

}