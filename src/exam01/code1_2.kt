package exam01

/**
 * 映画館の料金を計算するプログラム
 * シニア>一般>子供 の順で人数を入力して
 * 一人あたりの料金は、シニア: 1300円 一般: 2000円 子供: 1000円
 * ただし、10名以上の場合は、各200円割引
 *
 */

fun main() {
    fun input(ms: String): Int {
        print("${ms}: ")
        return readln().toInt()
    }

    val m = listOf(input("シニア"), input("一般"), input("子供"))
    val price = listOf(1300, 2000, 1000)

    val totalPrice = m.mapIndexed { i, v -> v * (price[i] - if (m.sum() > 9) 200 else 0)}.sum()

    println(totalPrice)
}