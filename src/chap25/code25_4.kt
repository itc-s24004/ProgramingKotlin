package chap25

fun main() {
    val p1 = Person("タケシ", 7)
    val p2 = Person(name = "タケシ", age = 7)
    val p3 = Person(age = 7, name = "タケシ")

    p1.greet()
    p2.greet()
    p3.greet()
}

class Person(val name: String = "", var age: Int = 0) {
    fun greet() {
        println("${name}です。${age}才です。")
    }
}