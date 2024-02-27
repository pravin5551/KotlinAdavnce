package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(private val startingNum : Int) : ViewModel() {

     private var counter = MutableLiveData<Int>();
    val countData:LiveData<Int>

    get() = counter

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