package chap50

fun main(args: Array<String>) {
    val a = listOf("こんにちは", "Kotlin", "どうぞ", "よろしく")

    println("forEach 使う方法1")
    a.forEach {
        println(it)
    }

    println("forEach 使う方法2")
    a.forEach(::println)
}