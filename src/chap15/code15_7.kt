package chap15

import kotlin.random.Random

fun main() {
    for (x in 1..10) {
        if ( x % 3 == 0) continue
        println("${x}回目の繰り返し処理")
    }
}