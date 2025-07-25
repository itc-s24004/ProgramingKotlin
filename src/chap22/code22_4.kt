package chap22

fun main() {
    val week = arrayOf("日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日")
    println("0~6 の数字を入力してください")

    val text = readln()

    try {
        val choice = text.toInt()
        println("選択肢: $choice は ${week[choice]} です")

    } catch (e: Exception) {
        println("${text} という文字は数値に変換できません")

    } catch (e: ArrayIndexOutOfBoundsException) {
        println("範囲外の選択肢です")
        
    }
}