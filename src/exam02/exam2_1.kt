package exam02

import kotlin.random.Random

fun main() {
    val dice = Dice(6)
    dice.roll()

    println("${dice.name} : ${dice.number}")


    val dice2 = Dice(6, "てすと")
    dice2.roll()

    println("${dice2.name} : ${dice2.number}")
}



//Dice という名前でサイコロを表すクラスを定義してください
//プロパティとして識別用の名前(name)を持ちます
//roll というメソッドでサイコロを振ります
//でた目は number というプロパティで繰り返し参照できること。
//一般的な6面サイコロ以外も対抗したいので、いくつまでの数を出せるか
//コンストラクタでパラメータとして受け取れるようにしてください


class Dice (val maxNumber: Int, val name: String) {
    var number = 0

    constructor(maxNumber: Int = 6) : this(maxNumber, "${maxNumber}面サイコロ")


    fun roll() {
        number = Random.nextInt(from = 1, until = maxNumber)
    }
}