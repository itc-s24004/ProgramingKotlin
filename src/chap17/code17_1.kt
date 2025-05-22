package chap17

fun main() {
    val a: List<Int> = listOf(1000, 1200, 1500)
    println("1年目の時給は ${a[0]}")
    println("2年目の時給は ${a[1]}")
    println("3年目の時給は ${a[2]}")

    for (money in a) {
        println("時給は ${money}です")
    }

    for ((i, m) in a.withIndex()) {
        println("${i+1}年目の時給は ${m}です")
    }
}