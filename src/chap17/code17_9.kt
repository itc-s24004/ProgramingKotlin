package chap17

fun main() {
    val a = mutableListOf("こんにちは", "Kotlin", "どうぞ", "よろしく")

    a.removeAt(2)
    for ((i, x) in a.withIndex()) {
        println("${i} : ${x}")
    }
}