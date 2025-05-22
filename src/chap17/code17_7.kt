package chap17

fun main() {
    val a = mutableListOf("こんにちは", "Kotlin", "よろしく")
    a.add("どうぞ")
    a.add("お願いします!")
    for ((i,x) in a.withIndex()) {
        println("${i} : ${x}")
    }
    println("-------------")
}