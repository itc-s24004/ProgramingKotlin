package exam01

/**
 * きーぼーどから　数字を入力して,1から入力された数までの
 * FizzzBuss を出力します
 *
 * FizzBuzz とは
 * 3の倍数のときに Fizz
 * 5の倍数のときに Buzz
 * 3と5の倍数のときに FizzBuzz
 * それ以外のときは数字をそのまま出力する
 * よくあるプログラムの練習問題です。
 */

fun main() {
    val i = readln().toInt()

    (1..i).forEach {
        val x = if (it%15==0) "FizzBuzz" else if (it%3==0) "Fizz" else if (it%5==0) "Buzz" else it
        println(x)
    }

    return


    (1..i).forEach(fun(i) {println(if (i%15==0) "FizzBuzz" else if (i%3==0) "Fizz" else if (i%5==0) "Buzz" else i)})

    (1..i).forEach {
        val f = if (it % 3 == 0) print("Fizz") else 0
        val b = if (it % 5 == 0) print("Buzz") else 0
        if (f==0 && b==0) println(it) else println()
    }
}