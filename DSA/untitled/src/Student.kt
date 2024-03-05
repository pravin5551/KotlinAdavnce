open class Student(var studentName : String) {
    init {
        println("This is Student class ")
    }

    constructor(sectionName: String,  id: Int): this(sectionName) {
    }

    companion object{
        fun lol(): Int{
            return 8
        }

        var lol : String? = null
    }

    open fun doSomething(){
        println("Hey there this is doSomething")
    }
}

fun main() {
    Student.lol()
val add: (Int, Int) -> Int = {a,b -> a-b}
    println(add(1,2))
}