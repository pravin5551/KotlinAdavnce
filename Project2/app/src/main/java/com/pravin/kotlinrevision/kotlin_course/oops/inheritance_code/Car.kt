package com.pravin.kotlinrevision.kotlin_course.oops.inheritance_code

class Car(var brand: String, var year: Int, var color: String) {



}

fun main() {
//    var teacher = Person("Pravin", 25)
//    var player = Person("Pravin", 25)
//    var bussinessMan = Person("Pravin")

//    println(bussinessMan.eat())
//    println(player.talk())
//    println(teacher.walk())

    var teacher = Person()
    teacher.age = 25
    teacher.name = "Pravin"
    println(teacher.name)
}