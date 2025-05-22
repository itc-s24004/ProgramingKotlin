package chap13

fun main() {
    for (y in 1..9) {
        for (x in 1..9) {
            print("%dx%d=%2d ".format(y, x, y*x))
        }
        println()
    }
}