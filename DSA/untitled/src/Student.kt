class Student(var studentName : String) {
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
}

fun main() {
    Student.lol()
}