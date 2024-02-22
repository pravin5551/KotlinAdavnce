package com.pravin.kotlinrevision.kotlin_course.oops

class Outer {

    class Nested{
        fun insideNested(){
            println("Inside Nested class")
        }
    }
}

fun main() {
    var outer = Outer()
    var inner = Outer.Nested()

    println(inner.insideNested())
}