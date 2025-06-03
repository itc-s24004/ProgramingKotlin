package exam01

import kotlin.random.Random
import kotlin.random.nextInt


/**
 * お釣りの計算
 * ランダムで100 ~ 9000の数値を生成します
 * 支払うこ税にをキーボードから入力します
 * お釣りを計算して、小銭ごとにその枚数を出力してください
 * トータルの枚数は最小になる組み合わせでお釣りを返します
 * 支払う金額が足りない場合は、「足りません」と出力してください
 *
 */

fun main() {
    val types = listOf(5000, 1000, 500, 100, 50, 10, 5, 1)
    val price = Random.nextInt(100..9000)

    println("料金: ${price}円")
    val pay = readln().toInt()

    var change = pay - price
    if (change < 0) return println("足りません")

    types.forEach { type ->
        val i = change/type
        change -= type*i

        val message = "${type}円${if (type < 1000) "玉" else "札"}: ${i}枚"
        println(message)
    }
}