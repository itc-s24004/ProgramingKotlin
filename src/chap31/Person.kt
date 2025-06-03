package chap31

open class Person(val name: String, val age: Int) {
    open fun greet() {
        println("${name}です。${age}才です。")
    }
}