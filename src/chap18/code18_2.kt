package chap18

fun main() {
    val s = mutableSetOf("あ", "い", "う", "え", "お")

    println(s)
    println("------")
    s.add("か")
    s += "き"
    s += "く"
    println("------")
    println(s)
}