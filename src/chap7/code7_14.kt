package chap7

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(from = 0, until = 100)
    println(a)
    println(if (a <= 59) 'D' else if (a <= 69) 'C' else if (a <= 79) 'B' else if (a <= 89) 'A' else 'S')

    if (a <= 59) {
        println('D')

    } else if (a <= 69) {
        println('C')

    } else if (a <= 79) {
        println('B')

    } else if (a <= 89) {
        println('A')

    } else {
        println('S')

    }
}