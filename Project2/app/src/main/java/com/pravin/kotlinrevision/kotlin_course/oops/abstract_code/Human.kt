package com.pravin.kotlinrevision.kotlin_course.oops.abstract_code

abstract class Human {
    var name: String = ""
    var age: Int = 0
    abstract fun displayAge()

    fun justFunMethod(){
        println("Hey there")
    }
}

class Pravin: Human(){
    override fun displayAge() {

        println("Inside Pravin ")
    }


}



fun main() {


    var pravin= Pravin()
    pravin.displayAge()
    pravin.justFunMethod()
}