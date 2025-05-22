package chap21

fun main() {
    val answer = getThreeTimes(5)
    println(answer)
}

fun getThreeTimes(value: Int): Int {
    return value * 3
}